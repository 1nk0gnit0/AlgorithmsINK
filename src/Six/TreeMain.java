package Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeMain {
    public static void main(String[] args) throws IOException{
        int value;
        Tree tree = new Tree();
        tree.insert(new Person(22));
        tree.insert(new Person(21));
        tree.insert(new Person(23));
        tree.insert(new Person(65));
        tree.insert(new Person(43));
        tree.insert(new Person(11));
        tree.insert(new Person(15));

        while(true){
            System.out.print("Enter first letter of show, ");
            System.out.print("insert, find, delete, or traverse: ");
            int choice = getChar();
            switch(choice){
                case 's':
                    tree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value to insert: ");
                    value = getInt();
                    tree.insert(new Person(value));
                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = tree.find(value);
                    if(found != null){
                        System.out.print("Found: ");
                    }
                    found.display();
                    System.out.print("\n");
                    break;
            }
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

}
