package graphs;
import java.util.HashMap;
import java.util.ArrayList;

public class Graphs {
    HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph() {
        System.out.println(adjList);
    }

    public boolean addVortex(String vortex) {
        if (adjList.get(vortex) == null) {
            adjList.put(vortex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vortex1, String vortex2) {
        if (adjList.get(vortex1) != null && adjList.get(vortex2) != null) {
            adjList.get(vortex1).add(vortex2);
            adjList.get(vortex2).add(vortex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vortex1, String vortex2) {
        if (adjList.get(vortex1) != null && adjList.get(vortex2) != null) {
            adjList.get(vortex1).remove(vortex2);
            adjList.get(vortex2).remove(vortex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex) {
        if (adjList.get(vertex) == null) return false;
            for (String otherVertex : adjList.get(vertex)) {
                adjList.get(otherVertex).remove(vertex);
            }
            adjList.remove(vertex);
        return true;
    }
}
