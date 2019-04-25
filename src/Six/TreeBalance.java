package Six;

import java.util.Random;

public class TreeBalance {
    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        Random random = new Random();

        while (k<20) {
        Tree tree = new Tree();

            int rnd = random.nextInt(200) - 100;
            tree.insert(new Person(rnd));
            while (n < 15) {
                rnd = random.nextInt(200) - 100;
                while (tree.find(rnd) != null) {
                    rnd = random.nextInt(200) - 100;
                }
                tree.insert(new Person(rnd));
                n++;
            }
            tree.displayTree();
            k++;
            System.out.println();
        }
    }
}
