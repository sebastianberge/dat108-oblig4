package no.hvl.dat108;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

class Graph {
    PriorityQueue<Vertex> vertexes;

    public Graph() {
        vertexes = new PriorityQueue<Vertex>(6, new Vertex());
    }

    public Graph(PriorityQueue<Vertex> vertexes) {
        this.vertexes = vertexes;
    }


    public Vertex maxDegreeVertex() {
        return vertexes.peek();
    }

    void breadthFirstSearch(Vertex v) {
         ArrayList<Vertex> visited = new ArrayList<Vertex>();

        LinkedList<Vertex> queue = new LinkedList<Vertex>();

        visited.add(v);
        queue.add(v);

        while(queue.size() != 0) {
            v = queue.poll();
            System.out.println(v.getName() +" ");

            for(Vertex n : v.edges) {
                if(!visited.contains(n))
                {
                    visited.add(n);
                    queue.add(n);
                }
            }
        }
    }

    public void addVertex(Vertex v) {
        vertexes.add(v);
    }

    public void removeVertex(Vertex v) {
        vertexes.remove(v);
    }

    public void addEdge(Vertex v1, Vertex v2) {
        v1.edges.add(v2);
        v2.edges.add(v1);
    }

    public void removeEdge(Vertex v1, Vertex v2) {
        v1.edges.remove(v2);
        v2.edges.remove(v1);
    }

    public void addUniEdge(Vertex fromEdge, Vertex toEdge) {
        fromEdge.edges.add(toEdge);
    }

    public void removeUniEdge(Vertex fromEdge, Vertex toEdge) {
        fromEdge.edges.remove(toEdge);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(hasUniEdges() ? "[Unidirectional]\n" : "[Non-unidirectional]\n");
        builder.append(String.format("Graph contains %d vertexes: \n", vertexes.size()));
        for(Vertex  v : vertexes) {
            builder.append(v.toString());
        }

        return builder.toString();
    }
       
    private boolean hasUniEdges () {
        for(Vertex v : vertexes) {
            if(v.hasUniEdges()) {
                return true;
            }
        }
        return false;
    }
}