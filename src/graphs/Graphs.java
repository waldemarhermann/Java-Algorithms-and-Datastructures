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
}
