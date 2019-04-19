package Four.List;

public class AppList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("One", 22);
        list.insert("Two", 27);
        list.insert("Three", 18);

        list.display();
        System.out.println();
        list.delete("Two");

        System.out.println(list.find("One").name);

        System.out.println();
        list.display();
    }
}
