package Three.Queue;

public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int items;
    private int maxSize;

    public Queue(int size) {
        this.maxSize = size;
        this.queue = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.items = 0;
    }

    public boolean isEmpty(){
        return (items == 0);
    }

    public boolean isFull(){
        return (items == maxSize);
    }

    public int size(){
        return items;
    }

    public void insert(int i){
        if (rear == maxSize - 1) rear = -1;
        queue[++rear] = i;
        items++;
    }

    public int remove(){
        int temp = queue[front++];
        if (front == maxSize) front = 0;
        items--;
        return temp;
    }

    public int peek(){
        return queue[front];
    }
}
