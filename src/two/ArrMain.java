package two;

public class ArrMain {
    public static void main(String[] args) {

        Array arr1 = new Array(1000);
        arr1.insertOrder(1000);
        arr1.display();
        System.out.println("Линейный поиск вернул: " + arr1.find(486));
        System.out.println("Двоичный поиск вернул: " + arr1.binaryFind(999));

        Array arr2 = new Array(10000);
        arr2.insertChaos(10000);
        System.out.println();
        System.out.println("Пузырьковая сортировка выполнена за:");
        arr2.sortBuble();

        Array arr3 = new Array(10000);
        arr3.insertChaos(10000);
        System.out.println();
        System.out.println("Сортировка методом выбора выполнена за:");
        arr3.sortSelect();

        Array arr4 = new Array(10000);
        arr4.insertChaos(10000);
        System.out.println();
        System.out.println("Сортировка методом вставки выполнена за:");
        arr4.sortInsert();
    }
}
