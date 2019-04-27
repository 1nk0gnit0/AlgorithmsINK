package Six;

public class Node {
    public Person person;
    public Node leftChild;
    public Node rightChild;

    public void display(){
        System.out.println(person.id);
    }
}
