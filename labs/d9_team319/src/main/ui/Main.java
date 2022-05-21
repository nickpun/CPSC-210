package ui;

import model.Leaf;
import model.Parent;

// Do not make any changes to this class.
public class Main {

    public static void main(String[] args) {
        Parent root = new Parent(1);
        Parent l2 = new Parent(2);
        root.addChild(l2);
        Parent r3 = new Parent(3);
        root.addChild(r3);
        Leaf l4 = new Leaf(4);
        l2.addChild(l4);
        Leaf r5 = new Leaf(5);
        l2.addChild(r5);
        Parent r6 = new Parent(6);
        r3.addChild(r6);
        Leaf l7 = new Leaf(7);
        r6.addChild(l7);

        root.print();

        System.out.println("");

        r3.print(); // by invoking print on r3, we take r3 to be the root
    }
}
