package iterator;

import java.util.ArrayList;

public class ThingCollection {
    private ArrayList<Thing> things = new ArrayList<>();

    public void add(Thing thing) {
        System.out.println("Ooh --- I have a new " + thing.getName());
        things.add(thing);
    }

    public void removeThingsThatStartWith(String prefix) {
        for (Thing thing : things) {
            if (thing.getName().startsWith(prefix)) {
                things.remove(thing);
            }
        }
    }
}
