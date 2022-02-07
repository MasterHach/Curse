package FifthTask;

import java.util.Arrays;
import java.util.stream.Stream;

public class Fifth {
    public static void FifthTask() {
        int n = 5;
        int k = 2;
        Good[] items = {new Good("документы", 5, 15000),
                new Good("слиток золота", 15, 25000),
                new Good("пачка долларов", 4, 7500),
                new Good("часы", 2, 10000),
                new Good("кольцо c изумрудом", 2, 50000)};
        Safe[][] bp = new Safe[n + 1][k + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < k + 1; j++) {
                if (i == 0 || j == 0) {
                    bp[i][j] = new Safe(new Good[]{}, 0);
                } else if (i == 1) {
                    bp[1][j] = items[0].getWeight() <= j ? new Safe(new Good[]{items[0]}, items[0].getPrice())
                            : new Safe(new Good[]{}, 0);
                } else {
                    if (items[i - 1].getWeight() > j)
                        bp[i][j] = bp[i - 1][j];
                    else {
                        int newPrice = items[i - 1].getPrice() + bp[i - 1][j - items[i - 1].getWeight()].getPrice();
                        if (bp[i - 1][j].getPrice() > newPrice)
                            bp[i][j] = bp[i - 1][j];
                        else {
                            bp[i][j] = new Safe(Stream.concat(Arrays.stream(new Good[]{items[i - 1]}),
                                    Arrays.stream(bp[i - 1][j - items[i - 1].getWeight()].getItems())).toArray(Good[]::new), newPrice);
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.println("\nThe most profitable pack is:\n");
        System.out.println(bp[n][k].getDescription());
    }
}
