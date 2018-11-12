package no.hvl.dat108;
import java.util.*;

public class BreadthFirstTraversal {

    @SuppressWarnings("unchecked")
    public static final <T extends Comparable<T>> Vertex<T>[] breadthFirstTraversal(Graph<T> graph, Vertex<T> source) {
        // For å slå opp under indeks
        final ArrayList<Vertex<T>> vertices = new ArrayList<Vertex<T>>();
        vertices.addAll(graph.getVertices());

        // For å slå opp via vertex
        final int n = vertices.size();
        final Map<Vertex<T>,Integer> vertexToIndex = new HashMap<Vertex<T>,Integer>();
        for (int i=0; i<n; i++) {
            final Vertex<T> v = vertices.get(i);
            vertexToIndex.put(v,i);
        }

        // Nabo-matrise
        final byte[][] adj = new byte[n][n];
        for (int i=0; i<n; i++) {
            final Vertex<T> v = vertices.get(i);
            final int idx = vertexToIndex.get(v);
            final byte[] array = new byte[n];
            adj[idx] = array;
            final List<Edge<T>> edges = v.getEdges();
            for (Edge<T> e : edges)
                array[vertexToIndex.get(e.getToVertex())] = 1;
        }

        // Besøkt-tabell
        final byte[] visited = new byte[n];
        for (int i = 0; i < visited.length; i++)
            visited[i] = -1;

        // For å holde resultater
        final Vertex<T>[] arr = new Vertex[n];

        // Start ved roten
        Vertex<T> element = source;
        int c = 0;
        int i = vertexToIndex.get(element); 
        int k = 0;

        arr[k] = element;
        visited[i] = 1;
        k++;

        final Queue<Vertex<T>> queue = new ArrayDeque<Vertex<T>>();
        queue.add(source);
        while (!queue.isEmpty()) {    
            element = queue.peek();
            c = vertexToIndex.get(element);
            i = 0;
            while (i < n) {
                if (adj[c][i] == 1 && visited[i] == -1) {
                    final Vertex<T> v = vertices.get(i);
                    queue.add(v);
                    visited[i] = 1;

                    arr[k] = v;
                    k++;
                }
                i++;
            }
            queue.poll();
        }
        return arr;
    }

    public static int[] breadthFirstTraversal(int n, byte[][] adjacencyMatrix, int source) {
        final int[] visited = new int[n];
        for (int i = 0; i < visited.length; i++)
            visited[i] = -1;

        int element = source;
        int i = source;
        int arr[] = new int[n];
        int k = 0;

        arr[k] = element;
        visited[i] = 1;
        k++;

        final Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.add(source);
        while (!queue.isEmpty()) {    
            element = queue.peek();
            i = 0;
            while (i < n) {
                if (adjacencyMatrix[element][i] == 1 && visited[i] == -1) {
                    queue.add(i);
                    visited[i] = 1;

                    arr[k] = i;
                    k++;
                }
                i++;
            }
            queue.poll();
        }
        return arr;
    }
}