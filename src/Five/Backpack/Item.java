package Five.Backpack;


public class Items {
    public Link first;
    public Items() {
        this.first = null;
    }


    public void insert(String name, int weight) {
        Link items = new Link(name, weight);
        items.next = first;
        first = items;
    }
}

