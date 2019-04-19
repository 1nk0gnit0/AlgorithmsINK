package Three.Deque;

public class Deque {
    private int[] deque;
    private int maxSize;
    private int front;
    private int rear;
    private int items;

    public Deque(int size) {
        this.deque = new int[this.maxSize = size];
        this.items = 0;
    }

    public boolean isEmpty(){
        return (items == 0);
    }

    public void insertRight(int i) {
        deque[front] = i;
        if (--front < 0) front = maxSize - 1;
        items++;
    }

    public void insertLeft(int i){
        if (++rear == maxSize) rear = 0;
        deque[rear] = i;
        items++;
    }

    public int removeRight(){
        if (++front == maxSize) front = 0;
        items--;
        return deque[front];
    }

    public int removeLeft(){
        int temp = deque[rear];
        if (--rear < 0) rear = maxSize - 1;
        items--;
        return temp;
    }
}
