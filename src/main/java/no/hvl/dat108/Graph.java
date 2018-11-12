package no.hvl.dat108;

import java.util.PriorityQueue;

class Graph {
    PriorityQueue<Vertex> vertexes;

    public Graph() {
        vertexes = new PriorityQueue<Vertex>(6, new Vertex());
    }

    public Vertex maxDegreeVertex() {
        return vertexes.peek();
    }

    public void addVertex(Vertex v) {
        vertexes.add(v);
    }
}