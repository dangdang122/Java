package report;
public class Menu {
    String name;
    int price;
    static final String CAFE_NAME = "AISW Cafe";
    static int count;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
        count++;
    }
}
