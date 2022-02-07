import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //////// first task ////////
        first.FirstTask();
        //////// second task ////////
        second.SecondTask();
        //////// third task ////////
        third.ThirdTask();
        //////// fourth task ////////
        fourth d = new fourth();
        d.FourthTask();
        //////// fifth task ////////
        int n = 5;
        int k = 2;
        fifth[] items = {new fifth("документы", 5, 15000),
                new fifth("слиток золота", 15, 25000),
                new fifth("пачка долларов", 4, 7500),
                new fifth("часы", 2, 10000),
                new fifth("кольцо c изумрудом", 2, 50000)};
        safe[][] bp = new safe[n + 1][k + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < k + 1; j++) {
                if (i == 0 || j == 0) {
                    bp[i][j] = new safe(new fifth[]{}, 0);
                } else if (i == 1) {
                    bp[1][j] = items[0].getWeight() <= j ? new safe(new fifth[]{items[0]}, items[0].getPrice())
                            : new safe(new fifth[]{}, 0);
                } else {
                    if (items[i - 1].getWeight() > j)
                        bp[i][j] = bp[i - 1][j];
                    else {
                        int newPrice = items[i - 1].getPrice() + bp[i - 1][j - items[i - 1].getWeight()].getPrice();
                        if (bp[i - 1][j].getPrice() > newPrice)
                            bp[i][j] = bp[i - 1][j];
                        else {
                            bp[i][j] = new safe(Stream.concat(Arrays.stream(new fifth[]{items[i - 1]}),
                                    Arrays.stream(bp[i - 1][j - items[i - 1].getWeight()].getItems())).toArray(fifth[]::new), newPrice);
                        }
                    }
                }
            }
        }
        System.out.println("\nThe most profitable pack is:\n");
        System.out.println(bp[n][k].getDescription());
    }
}
