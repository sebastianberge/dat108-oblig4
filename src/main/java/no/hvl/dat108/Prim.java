package no.hvl.dat108;

import java.util.*;

public class Prim {

    private Prim() { }

    public static CostPathPair<Integer> getMinimumSpanningTree(Graph<Integer> graph, Vertex<Integer> start) {
        if (graph == null)
            throw (new NullPointerException("Graf kan ikke være NULL."));

        // Prims algoritme gjelder kun for ikke-rettede grafer
        if (graph.getType() == Graph.TYPE.DIRECTED) 
            throw (new IllegalArgumentException("Kun ikke-rettede grafer."));

        int cost = 0;

        final Set<Vertex<Integer>> unvisited = new HashSet<Vertex<Integer>>();
        unvisited.addAll(graph.getVertices());
        unvisited.remove(start); // O(1)

        final List<Edge<Integer>> path = new ArrayList<Edge<Integer>>();
        final Queue<Edge<Integer>> edgesAvailable = new PriorityQueue<Edge<Integer>>();

        Vertex<Integer> vertex = start;
        while (!unvisited.isEmpty()) {
            // Legg til alle kanter til ubesøkte noder
            for (Edge<Integer> e : vertex.getEdges()) {
                if (unvisited.contains(e.getToVertex()))
                    edgesAvailable.add(e);
            }

            // Fjern kanten med lavest kostnad
            final Edge<Integer> e = edgesAvailable.remove();
            cost += e.getCost();
            path.add(e); // O(1)

            vertex = e.getToVertex();
            unvisited.remove(vertex); // O(1)
        }

        return (new CostPathPair<Integer>(cost, path));
    }
}