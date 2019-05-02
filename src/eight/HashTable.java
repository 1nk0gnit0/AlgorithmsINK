package eight;

public class HashTable {
    private SortedList[] hashArray;
    private int arraySize;

    public HashTable(int size){
        arraySize = size;
        hashArray = new SortedList[arraySize];
        for(int j=0; j<arraySize; j++) hashArray[j] = new SortedList();
    }

    public void displayTable(){
        for(int j=0; j<arraySize; j++){
            System.out.print(j + ". ");
            hashArray[j].displayList();
        }
        System.out.println("........................................................");
    }

    public int hashFunc(int key){
        return key % arraySize;
    }

    public void insert(Link theLink){
        int key = theLink.getKey();
        int hashVal = hashFunc(key);
        hashArray[hashVal].insert(theLink);
    }

    public void delete(int key){
        int hashVal = hashFunc(key);
        hashArray[hashVal].delete(key);
    }

    public Link find(int key){
        int hashVal = hashFunc(key);
        Link theLink = hashArray[hashVal].find(key);
        if(theLink != null) {
            System.out.println("Найден");
            return theLink;
        }else{
            System.out.println("Не найден");
            return null;
        }
    }
}
