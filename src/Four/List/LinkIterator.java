package Four.List;

public class LinkIterator {
    private Link current;
    private Link prev;
    private LinkedList list;

    public LinkIterator (LinkedList list){
        this.list = list;
        reset();
    }

    private void reset( ) {
        current = list.getFirst();
        prev = null;
    }

    public void nextLink(){
        prev = current;
        current = current.next;
    }

    public boolean atEnd(){
        return (current.next == null);
    }

    public void insertBefore(String name, int age){
        Link newLink = new Link()
    }

    public void insertAfter(){

    }

    public String deleteCurrent(){
        return null;
    }

    public Link getCurrent( ) {
        return current;
    }
}
