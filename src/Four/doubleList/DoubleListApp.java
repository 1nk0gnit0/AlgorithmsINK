package Four.doubleList;

public class DoubleListApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst("One", 23);
        list.insertFirst("Two", 21);
        list.insertFirst("Three", 25);

        list.insertLast("Four", 29);

        list.display();
        System.out.println();

        list.delete("Two");

        list.display();
        System.out.println();

        list.delete();

        list.display();
    }
}
