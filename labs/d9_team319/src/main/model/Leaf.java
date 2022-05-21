package model;

// Represents a leaf node
public class Leaf extends Node {

    public Leaf(int data) {
        super(data);
    }

    @Override
    public void print(int tabs) {
        Printer.indent(tabs);
        print();
    }
}
