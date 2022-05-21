package model;

import java.util.ArrayList;
import java.util.List;

// Do not make any changes to this class.
public class Printer {

    public static List<String> buffer = new ArrayList<String>();

    // REQUIRES: tabs is non-negative
    // EFFECTS: prints indentation (4 spaces for each tab)
    public static void indent(int tabs){
        for(int tab=0; tab<tabs; tab++)
            System.out.print("    ");
    }

    // REQUIRES: depth and height are non-negative
    // EFFECTS: prints data, height and depth in specific format.
    public static void print(int data, int height, int depth){
        String str = String.format("Node: %d - Height: %d - Depth: %d", data, height, depth);
        buffer.add(str);
        System.out.println(str);
    }
}
