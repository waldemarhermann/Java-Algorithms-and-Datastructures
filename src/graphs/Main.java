package graphs;

public class Main {

    public static void main(String[] args) {
        Graphs myGraph = new Graphs();
        myGraph.addVortex("A");
        myGraph.addVortex("B");
        myGraph.printGraph();

        myGraph.addEdge("A", "B");
        myGraph.printGraph();
    }
}
