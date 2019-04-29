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

        graph.addEdge(0, 1); // A - B
        graph.addEdge(1, 2); // B - C
        graph.addEdge(2, 3); // C - D
        graph.addEdge(3, 4); // D - E
        graph.addEdge(4, 10); // E - K
        graph.addEdge(0, 5); // A - F
        graph.addEdge(5, 6); // F - G
        graph.addEdge(6, 7); // G - H
        graph.addEdge(7, 10); // H - K
        graph.addEdge(0, 8); // A - I
        graph.addEdge(8, 9); // I - J
        graph.addEdge(9, 10); // J - K

        graph.bfsPath('A','K');
    }
}
