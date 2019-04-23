package Five.Backpack;


public class Item {

    private String name;
    private int weigth;
    private int price;

    public Item(String name, int weigth, int price) {
        this.name = name;
        this.weigth = weigth;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
       return "\n" + name + ": масса=" + weigth + ", ценность=" + price;
    }
}
