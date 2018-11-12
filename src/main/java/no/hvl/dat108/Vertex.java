package no.hvl.dat108;
import java.util.Comparator;
import java.util.HashSet;

public class Vertex implements Comparator<Vertex> {
    HashSet<Vertex> edges;
    private String name;
    
    public Vertex() {
        edges = new HashSet<Vertex>();
    }

    public Vertex(String name) {
        this.name = name;
        edges = new HashSet<Vertex>();
    }

    public int compare(Vertex v1, Vertex v2) {
        return Integer.compare(v1.edges.size(), v2.edges.size());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Vertex %s with %d edges%s", this.name, edges.size(), (edges.size()==0) ? "\n" : ":\n"));
        for(Vertex v : edges) {
            if(!v.edges.contains(this)) {
                builder.append(String.format("Unidirectional from %s to %s \n", this.name, v.name));
            }
            else {
            builder.append(String.format("From %s to %s \n", this.name, v.name));
            }
        }
        return builder.toString();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasUniEdges() {
        for(Vertex v : edges) {
            if(this.edges.contains(v) && v.edges.contains(this)) {
                return true;
            }
        }
        return false;
    }
}