package eight;

public class App {
    public static void main(String[] args) {
        Link aDataItem;
        int size = 10;

        HashTable theHashTable = new HashTable(size);

        Pers p = new Pers("Make");
        Pers p1 = new Pers("Mike");
        Pers p2 = new Pers("Matthias");
        Pers p3 = new Pers("Maud");
        Pers p4 = new Pers("Maude");
        Pers p5 = new Pers("Mavis");
        Pers p6 = new Pers("Mike");

        System.out.println();

        //Добавление элементов

        aDataItem = new Link(p.hashCode());
        theHashTable.insert(aDataItem);
        aDataItem = new Link(p1.hashCode());
        theHashTable.insert(aDataItem);
        aDataItem = new Link(p2.hashCode());
        theHashTable.insert(aDataItem);
        aDataItem = new Link(p3.hashCode());
        theHashTable.insert(aDataItem);
        aDataItem = new Link(p4.hashCode());
        theHashTable.insert(aDataItem);
        aDataItem = new Link(p5.hashCode());
        theHashTable.insert(aDataItem);
        aDataItem = new Link(p6.hashCode());
        theHashTable.insert(aDataItem);
        theHashTable.displayTable();

        //Удаление элементов
        theHashTable.delete(p6.hashCode());
        theHashTable.displayTable();

        //Поиск

        theHashTable.find(p2.hashCode());
    }
}
