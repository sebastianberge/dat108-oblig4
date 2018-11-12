package no.hvl.dat108;

class Graph {
    PriorityQueue<Vertex> vertexes;

    public Graph() {
        vertexes = new PriorityQueue<Vertex>(6, new Vertex());
    }

    public Vertex maxDegreeVertex() {
        return vertexes.peek();
    }

    public addVertex(Vertex v) {
        vertexes.addVertex(v);
    }
}