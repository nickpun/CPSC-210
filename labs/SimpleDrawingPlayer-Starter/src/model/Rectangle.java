package model;

import sound.MidiSynth;

import java.awt.*;

public class Rectangle extends Shape {
    public Rectangle(Point topleft, MidiSynth midiSynth) {
        super(topleft, midiSynth);
    }

    @Override
    //EFFECTS: draws the shape
    protected void drawGraphics(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    @Override
    //EFFECTS: fills the shape
    protected void fillGraphics(Graphics g) {
        g.fillRect(x, y, width, height);
    }
}
