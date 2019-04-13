package Three.PriorityQueue;

public class PriorityQueue {
    private int maxSize;
    private int[] queueArr;
    private int items;


    public PriorityQueue(int i) {
        this.maxSize = i;
        this.queueArr = new int[maxSize];
        items = 0;
    }

    public void insert(int item){
        int i;
        if(items == 0){
            queueArr[items++] = item;
        }else{
            for(i = items-1; i >= 0; i--){
                if(item > queueArr[i]){
                    queueArr[i+1] = queueArr[i];
                }else{
                    break;
                }
            }
            queueArr[i+1] = item;
            items++;
        }
    }

    public void insertArr(){
        for(int i = 0; i < maxSize; i++){
            int n = (int) (Math.random() * 100);
            insert(n);
        }
    }

    public int remove(){
        return queueArr[--items];
    }

    public int peek(){
        return queueArr[items-1];
    }

    public boolean isEmpty(){
        return (items == 0);
    }

    public boolean isFull(){
        return (items == maxSize);
    }
}
