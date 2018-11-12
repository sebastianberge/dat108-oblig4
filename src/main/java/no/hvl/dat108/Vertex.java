package no.hvl.dat108;

public class Vertex implements Comparator<Vertex> {
    HashSet<Vertex> edges;

    public Vertex() {
        edges = new HashSet<Vertex>();
    }

    public compare(Vertex v1, Vertex v2) {
        v2.edges.size().compareTo(v1.edges.size());
    }
}