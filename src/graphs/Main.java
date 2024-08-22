package graphs;

public class Main {

    public static void main(String[] args) {
        Graphs myGraph = new Graphs();
        myGraph.addVortex("A");
        myGraph.addVortex("B");
        myGraph.addVortex("C");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");

        myGraph.removeEdge("A", "B");
        myGraph.printGraph();
    }
}
