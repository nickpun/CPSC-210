package model;

import java.util.ArrayList;
import java.util.List;

// represents a parent node (root or otherwise inner nodes)
public class Parent extends Node {
    private List<Node> children;

    public Parent(int data) {
        super(data);
        children = new ArrayList<>();
    }

    public void addChild(Node node) {
        if (!children.contains(node)) {
            children.add(node);
        }
    }

    @Override
    public void print(int tabs) {
        Printer.indent(tabs);
        print();
    }
}
