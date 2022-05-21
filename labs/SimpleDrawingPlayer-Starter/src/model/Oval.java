package model;

import sound.MidiSynth;

import java.awt.*;

public class Oval extends Shape {
    public Oval(Point topleft, MidiSynth midiSynth) {
        super(topleft, midiSynth);
    }

    @Override
    //EFFECTS: draws the shape
    protected void drawGraphics(Graphics g) {
        g.drawOval(x, y, width, height);
    }

    @Override
    //EFFECTS: fills the shape
    protected void fillGraphics(Graphics g) {
        g.fillOval(x, y, width, height);
    }
}
