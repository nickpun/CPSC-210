package tests;

import model.Leaf;
import model.Parent;
import model.Printer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest {

    @BeforeEach
    void setup(){
        Printer.buffer.clear();
    }

    @Test
    // Test a rooted tree that consist of one node only
    void testOneNode(){
        Leaf root = new Leaf(1);
        root.print();
        assertEquals(makeExpectedOutput(1,0,0), Printer.buffer.get(0));
    }

    @Test
    // Test a rooted tree that consist of two nodes: a root and a leaf
    void testOneRootOneLeaf(){
        Parent root = new Parent(1);
        Leaf leaf = new Leaf(2);
        root.addChild(leaf);
        root.print();
        assertEquals(makeExpectedOutput(1,1,0), Printer.buffer.get(0));
        assertEquals(makeExpectedOutput(2,0,1), Printer.buffer.get(1));
    }

    /*
     *      Add more tests here!
     */

    // Helper method
    private String makeExpectedOutput(int data, int height, int depth){
        return String.format("Node: %d - Height: %d - Depth: %d", data, height, depth);
    }
}
