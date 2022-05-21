package ca.ubc.cpsc210.spaceinvaders.ui;

import java.util.Observable;
import java.util.Observer;

public class Printer implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (arg.equals("invader")) {
            System.out.println("Ouch! Invader Hit!");
        }
    }
}
