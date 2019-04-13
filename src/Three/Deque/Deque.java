package Three.Deque;

public class Deque {
    private int[] deque;
    private int maxSize;
    private int front;
    private int rear;
    private int items;

    public Deque(int size) {
        this.maxSize = size;
        this.deque = new int[maxSize];
        this.front = 0;
        this.rear= 0;
        this.items = 0;
    }

    public boolean isEmpty(){
        return (items == 0);
    }

    public void insertLeft(int item){
        if(isEmpty()) {
            deque[rear] = item;
            items++;
        }else {
            for (int i = items-1; i >= 0; i--) {
                    deque[i+1] = deque[i];
                }
            deque[rear] = item;
            items++;
            }
        }


    public void insertRight(int i){
        deque[items] = i;
        items++;
    }

    public int removeLeft(){
        int temp = deque[front++];
        if (front == maxSize) front = 0;
        items--;
        return temp;
    }

    public int removeRight(){
        return deque[items--];
    }
}
