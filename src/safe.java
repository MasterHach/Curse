import java.util.Arrays;
import java.util.stream.Collectors;
public class safe {
    fifth[] items;
    int price;
    public safe(fifth[] items, int price) {
        this.items = items;
        this.price = price;
    }
    public fifth[] getItems() {
        return items;
    }
    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return items == null ? "" : Arrays.stream(items).map(fifth::getName).collect(Collectors.joining(" + ")) + " = " + getPrice();
    }
}

