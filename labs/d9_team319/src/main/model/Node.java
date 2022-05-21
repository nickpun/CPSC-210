package model;

import java.util.Objects;

// Represent a node
public abstract class Node {
    protected int data;
    protected int height;
    protected int depth;

    public Node(int data) {
        this.data = data;
    }

    // EFFECTS: prints this properties of this node (its value, height and depth) as root and properties of all its children
    public void print(){
        print(0);
        Printer.print(data, height, depth);
    }

    // REQUIRES: tabs is non-negative
    // EFFECTS: prints data, height and depth of this node with appropriate indentation
    public abstract void print(int tabs);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node that = (Node) o;

        return Objects.equals(data, that.data);

    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
