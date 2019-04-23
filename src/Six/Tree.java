package Six;

public class Tree {
    public Node root;

    public Node find(int key) {
        Node current = root;
        while (current.person.id != key){
            if(key < current.person.id) current = current.leftChild;
            else current = current.rightChild;
            if(current == null) return null;
        }
        return current;
    }

    public void insert(Person p){
        Node node = new Node();
        node.person = p;
        if(root == null) root = node;
        else{
            Node current = root;
            Node parent;
            while (true){
                parent = current;
                if(p.id < current.person.id){
                    current = current.leftChild;
                    if(current == null){
                        parent.leftChild = node;
                        return;
                    }
                }else{
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    public void inOrder(Node root){
        if(root != null){
            inOrder(root.leftChild);
            root.display();
            inOrder(root.rightChild);
        }
    }

    public Node min(){
        Node current, last = null;
        current = root;
        while (current !=null){
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node max(){
        Node current, last = null;
        current = root;
        while (current !=null){
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public boolean delete(int key){
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.person.id != key){
            parent = current;
            if(key < current.person.id){
                isLeftChild =true;
                current = current.leftChild;
            }else{
                isLeftChild = false;
                current = current.rightChild;
            }
        }
        if(current == null) return false;
        if(current.leftChild == null && current.rightChild == null){
            if (current == root) root = null;
            else if (isLeftChild) parent.leftChild = null;
            else parent.rightChild = null;
        }else if(current.rightChild == null){
            if (current == root) root = current.leftChild;
            else if(isLeftChild) parent.leftChild = current.leftChild;
            else parent.rightChild = current.leftChild;
        }else if(current.leftChild == null){
            if(current == root) root = current.rightChild;
            else if(isLeftChild) parent.leftChild = current.rightChild;
            else parent.rightChild = current.rightChild;
        }else{
            Node successor = getSuccessor(current);
            if(current == root) root = successor;
            else if(isLeftChild) parent.leftChild = successor;
            else parent.rightChild = current.leftChild;
        }
        return true;
    }

    public Node getSuccessor(Node node){
        Node successorParent = node;
        Node successor = node;
        Node current = node.rightChild;
        while (current != null){
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if(successor != node.rightChild){
            successorParent.leftChild = successor.rightChild;
            successor.leftChild = node.rightChild;
        }
        return successor;
    }

    public void displayTree( ) {
        Stack stack = new Stack(100);
        stack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;

        while (!isRowEmpty) {
            Stack localStack = new Stack(100);
            isRowEmpty = true;
            for(int i=0;i<nBlanks;i++){
                System.out.print(" ");
            }
            while (!stack.isEmpty()) {
                Node temp = stack.pop();
                if (temp != null){
                    temp.display();
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if(temp.leftChild != null || temp.rightChild != null){
                        isRowEmpty = false;
                    }
                }else{
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j=0; j < nBlanks * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println(" ");
            nBlanks = nBlanks / 2;
            while (!localStack.isEmpty()) {
                stack.push(localStack.pop());
            }
            System.out.println("...............................................");
        }
    }

}

