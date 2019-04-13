package Three.Deque;

public class MainDeque {
    public static void main(String[] args) {
        Deque d = new Deque(5);

        d.insertRight(3);

        d.insertLeft(2);

        d.removeRight();

        d.insertRight(4);

        d.insertLeft(1);

        d.removeRight();

        d.insertRight(5);
        d.insertRight(6);
        d.insertRight(7);

        d.removeLeft();

        while (!d.isEmpty()){
            int n = d.removeLeft();
            System.out.print(n + " ");
        }
    }
}
