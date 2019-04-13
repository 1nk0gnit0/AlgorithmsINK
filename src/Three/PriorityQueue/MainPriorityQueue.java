package Three.PriorityQueue;

public class MainPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue(5);

        q.insertArr();

        while(!q.isEmpty()){
            int item = q.remove();
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
