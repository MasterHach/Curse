package FifthTask;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Safe {
    Good[] items;
    int price;
    public Safe(Good[] items, int price) {
        this.items = items;
        this.price = price;
    }
    public Good[] getItems() {
        return items;
    }
    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return items == null ? "" : Arrays.stream(items).map(Good::getName).collect(Collectors.joining(" + ")) + " = " + getPrice();
    }
}
