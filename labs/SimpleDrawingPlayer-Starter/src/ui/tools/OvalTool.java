package ui.tools;

import model.Oval;
import ui.DrawingEditor;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class OvalTool extends ShapeTool {
    public OvalTool(DrawingEditor editor, JComponent parent) {
        super(editor, parent);
    }

    //EFFECTS: Returns the string for the label.
    private String getLabel() {
        return "Oval";
    }

    //EFFECTS: Constructs and returns the new shape
    private void makeShape(MouseEvent e) {
        shape = new Oval(e.getPoint(), editor.getMidiSynth());
    }
}