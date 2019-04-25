package Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class TreeMain {
    public static void main(String[] args) throws IOException{
        int value;
        int n = 0;
        Random random = new Random();

        Tree tree = new Tree();
        tree.insert(new Person(random.nextInt(200)-100));
        while(n < 15){
            int rnd = random.nextInt(200)-100;
            while (tree.find(rnd) != null) {
                rnd = random.nextInt(200) - 100;
            }
        tree.insert(new Person(rnd));
        n++;
        }

        tree.displayTree();


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
                case 'd':
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    tree.delete(value);
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
