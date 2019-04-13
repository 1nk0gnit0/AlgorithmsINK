package Three.Deque;

public class MainDeque {
    public static void main(String[] args) {
        Deque d = new Deque(5);

        d.insertRight(1);
        d.insertRight(2);
        d.insertRight(3);

        d.insertLeft(4);
        d.insertLeft(5);

        d.removeLeft();

        d.removeRight();

        while (!d.isEmpty()){
            int n = d.removeLeft();
            System.out.print(n + " ");
        }
    }
}
