package Three.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);

        q.remove();
        q.remove();

        q.insert(6);
        q.insert(7);

        while (!q.isEmpty()){
            int n = q.remove();
            System.out.println(n);
        }
    }
}
