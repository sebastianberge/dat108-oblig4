package no.hvl.dat108;

import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Vertex a = new Vertex("0");
        Vertex b = new Vertex("1");
        Vertex c = new Vertex("2");
        Vertex d = new Vertex("3");
        Vertex e = new Vertex("4");
        Vertex f = new Vertex("5");

        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);
        graph.addVertex(e);
        graph.addVertex(f);

        graph.addEdge(a, b);
        graph.addEdge(a, c);
        graph.addEdge(b, c);
        graph.addEdge(d, e);
        graph.addEdge(e, e);
        graph.breadthFirstSearch(c);
    }
}