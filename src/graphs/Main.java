package graphs;

public class Main {

    public static void main(String[] args) {
        Graphs myGraph = new Graphs();
        myGraph.addVortex("A");
        myGraph.addVortex("B");
        myGraph.addVortex("C");
        myGraph.addVortex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");

        myGraph.removeVertex("D");
        myGraph.printGraph();
    }
}
