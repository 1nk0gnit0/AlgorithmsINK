package Seven;

public class GraphApp {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addEdge(0, 1, 50); // A - B
        graph.addEdge(1, 2, 50); // B - C
        graph.addEdge(0, 3, 50); // A - D
        graph.addEdge(3, 4, 50); // D - E
        graph.dfs();
    }
}

