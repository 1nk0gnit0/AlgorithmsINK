package Seven;

import Three.Queue.Queue;
import Three.Stack.Stack;

public class Graph {
    private int maxVertex = 32;
    private int INFINITY = 1000000;
    private Vertex[] vertexList;
    private int[][] matrix;
    private int size;
    private Stack pathStack;

    Stack stack;
    Queue queue;

    public Graph( ) {
        queue = new Queue(maxVertex);
        stack = new Stack(maxVertex);
        vertexList = new Vertex[maxVertex];
        matrix = new int[maxVertex][maxVertex];
        size = 0;
        pathStack = new Stack(maxVertex);
    }

    public void addEdge(int start, int end, int weight){
        matrix[start][end] = weight;
    }

    public void addVertex(char label) {
        vertexList[size++] = new Vertex(label);
    }

    public void displayVertex(int vertex) {
        System.out.print(vertexList[vertex].label);
    }

    //depth-first search
    public void dfs( ) {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            int v = getUnvisitedVertex(stack.peek());
            if (v == -1)
                stack.pop();
            else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                stack.push(v);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    //breadth-first search
    public void bfs( ) {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        queue.insert(0);
        int w;
        while (!queue.isEmpty()) {
            int v = queue.remove();
            while ((w = getUnvisitedVertex(v)) != -1) {
                vertexList[w].wasVisited = true;
                displayVertex(w);
                queue.insert(w);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
    }


    private int getUnvisitedVertex(int ver) {
        for (int i = 0; i < size; i++) {
            if (matrix[ver][i] == 1 && !vertexList[i].wasVisited)
                return i;
        }
        return -1;
    }

    public int getIndexVertex(char vertex){
        for (int i = 0; i < size; i++) {
            if (vertexList[i].label == vertex){
                return i;
            }
        }
        return -1;
    }

    public void bfsPath(char from, char to){
        int start = getIndexVertex(from);
        int goal = getIndexVertex(to);
        if (start == -1 || goal == -1) {
            System.out.println("Вершина не найдена");
            return;
        }
        vertexList[start].wasVisited = true;
        queue.insert(start);
        while (!queue.isEmpty()){
            if (start == goal){
                pathStack.push(start);
                getPath(start);
                break;
            }
            int firstVertex = queue.remove();
            int adjUnvisitedVertex;
            while ((adjUnvisitedVertex = getUnvisitedVertex(firstVertex)) != -1){
                vertexList[adjUnvisitedVertex].wasVisited = true;
                queue.insert(adjUnvisitedVertex);
                vertexList[adjUnvisitedVertex].parent = firstVertex;
                if (adjUnvisitedVertex == goal){
                    start = adjUnvisitedVertex;
                }
            }
        }
        printPath(from, to);
        resetWasVisited();
    }

    private void getPath(int vertex){
        int parentVertex = vertexList[vertex].parent;
        if (parentVertex == -1) return;
        pathStack.push(parentVertex);
        getPath(parentVertex);
    }

    private void printPath(char from, char to){
        if (pathStack.isEmpty()){
            System.out.println("Путь от " + from + " до " + to + " не найден");
        } else {
            System.out.println("Кратчайший путь от " + from + " до " + to + ": ");
            while (!pathStack.isEmpty()) {
                displayVertex(pathStack.pop());
                if (!pathStack.isEmpty()) System.out.print("-");
            }
        }
    }

    private void resetWasVisited(){
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
    }
 }



