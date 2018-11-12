package no.hvl.dat108;

import java.util.*;

public class CostVertexPair<T extends Comparable<T>> implements Comparable<CostVertexPair<T>> {

    private int cost = Integer.MAX_VALUE;
    private Vertex<T> vertex = null;

    public CostVertexPair(int cost, Vertex<T> vertex) {
        if (vertex == null)
            throw (new NullPointerException("Node/Vertex kan ikke være NULL."));

        this.cost = cost;
        this.vertex = vertex;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Vertex<T> getVertex() {
        return vertex;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return 31 * (this.cost * ((this.vertex!=null)?this.vertex.hashCode():1));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object e1) {
        if (!(e1 instanceof CostVertexPair))
            return false;

        final CostVertexPair<?> pair = (CostVertexPair<?>)e1;
        if (this.cost != pair.cost)
            return false;

        if (!this.vertex.equals(pair.vertex))
            return false;

        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int compareTo(CostVertexPair<T> p) {
        if (p == null)
            throw new NullPointerException("CostVertexPair 'p' kan ikke være NULL.");

        if (this.cost < p.cost)
            return -1;
        if (this.cost > p.cost)
            return 1;
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(vertex.getValue()).append(" (").append(vertex.getWeight()).append(") ").append(" kostnad=").append(cost).append("\n");
        return builder.toString();
    }
}