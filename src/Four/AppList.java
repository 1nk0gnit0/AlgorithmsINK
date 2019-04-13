package Four;

public class AppList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.inseert("One", 22);
        list.inseert("Two", 27);
        list.inseert("Three", 18);

        list.display();
        System.out.println();
        list.delete("Two");

        System.out.println(list.find("One").name);

        System.out.println();
        list.display();
    }
}
