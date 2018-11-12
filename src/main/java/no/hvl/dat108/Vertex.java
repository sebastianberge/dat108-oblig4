package no.hvl.dat108;
import java.util.Comparator;
import java.util.HashSet;

public class Vertex implements Comparator<Vertex> {
    HashSet<Vertex> edges;

    public Vertex() {
        edges = new HashSet<Vertex>();
    }

    public int compare(Vertex v1, Vertex v2) {
        return Integer.compare(v1.edges.size(), v2.edges.size());
    }
}