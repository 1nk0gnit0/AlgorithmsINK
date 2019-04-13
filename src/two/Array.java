package two;

public class Array {
    private int[] arr;
    private int size;

    public Array(int s) {
        this.arr = new int[s];
        this.size = 0;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean find(int value) {         //линейный поиск
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == value) break;
        }
        if (i == size) return false;
        else return true;
    }

    public void insertChaos(int s) {            //заполняет массив случайными значениями от 0 до 999
        while (size < s ) {
            int n = (int) (Math.random() * 1000);
            arr[size] = n;
            size++;
        }
    }

    public void insertOrder(int s) {            //заполняет массив случайными значениями от 0 до 999 и сортирует их по возрастанию
        while (size < s ) {
            int n = (int) (Math.random() * 1000);
            int i;
            for (i = 0; i < size; i++) {
                if (arr[i] > n) break;
            }
            for (int j = size; j > i; j--) {
                arr[j] = arr[j - 1];
            }
            arr[i] = n;
                size++;
        }
    }

    public void delete(int value) {             //удаляет заданный элемент массива
        for (int i = 0; i < size; i++) {
            if (arr[i] == value){
               for (int j = i; j < size - 1; j++) {
                  arr[j] = arr[j + 1];
               }
               size--;
               break;
            }
        }
    }

    public void insert(){                       //добавляет в конец массива случайное значение от 0 до 999
        arr[size] = (int) (Math.random() * 1000);
        size++;
    }

    public boolean binaryFind (int value){              //двоичный поиск
        int low = 0;
        int high = this.size - 1;
        int mid;
        while (low <= high){
            mid = (low + high) / 2;
            if (value == this.arr[mid]) return true;
            else{
                if (value < this.arr[mid]) {
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
        }
        return false;
    }

    public void sortBuble(){                                //пузырьковая сортировка
        int in, out;
        long start = System.nanoTime();
        for (out = size - 1; out >= 1;out--){
            for (in = 0; in < out; in++){
                if(arr[in] > arr[in + 1]) change(in, in + 1, arr);
            }
        }
        long end = System.nanoTime();
        long traceTime = (end-start)/1000000;
        System.out.println(traceTime + " ms");
    }

    public void sortSelect() {                              //сортировка метдом выбора
        int in, out, mark;
        long start = System.nanoTime();
        for (out = 0; out < size; out++) {
            mark = out;
            for (in = out + 1; in < size; in++) {
                if (arr[in] < arr[mark]) {
                    mark = in;
                }
            }
            change(out, mark, arr);
        }
        long end = System.nanoTime();
        long traceTime = (end-start)/1000000;
        System.out.println(traceTime + " ms");
    }

    public void sortInsert() {                              //сортировка методом вставки
        int in, out;
        long start = System.nanoTime();
        for (out = 1; out < size; out++) {
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = temp;
        }
        long end = System.nanoTime();
        long traceTime = (end-start)/1000000;
        System.out.println(traceTime + " ms");
    }

    private void change(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}




