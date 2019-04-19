package Four.List;

public class LinkedIterator {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkIterator iterator = new LinkIterator(list);

        iterator.insertAfter("One", 21);
        iterator.insertAfter("Two", 23);
        iterator.insertBefore("Three", 25);
        iterator.insertAfter("Four", 27);
        iterator.insertBefore("Five", 29);

        list.display();
        System.out.println();

        iterator.nextLink();
        iterator.deleteCurrent();

        list.display();
    }
}
