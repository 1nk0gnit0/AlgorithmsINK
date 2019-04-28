package Seven;

public class GrafDistApp {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');
        graph.addVertex('J');
        graph.addVertex('K');

        graph.addEdge(0, 1, 1); // A - B
        graph.addEdge(1, 2, 1); // B - C
        graph.addEdge(2, 3, 1); // C - D
        graph.addEdge(3, 4, 1); // D - E
        graph.addEdge(4, 10, 1); // E - K
        graph.addEdge(0, 5, 1); // A - F
        graph.addEdge(5, 6, 1); // F - G
        graph.addEdge(6, 7, 1); // G - H
        graph.addEdge(7, 10, 1); // H - K
        graph.addEdge(0, 8, 1); // A - I
        graph.addEdge(8, 9, 1); // I - J
        graph.addEdge(9, 10, 1); // J - K

        graph.bfsPath('A','K');

        /*System.out.println("Кратчайший путь: ");
        graph.path();
        System.out.println();*/
    }
}
