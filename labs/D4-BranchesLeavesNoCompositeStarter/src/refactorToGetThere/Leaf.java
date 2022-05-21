package refactorToGetThere;

public class Leaf implements Offshoot {
    String colour = "GREEN";
    String name;
    public Leaf(String name) {
        super();
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void changeColor(String colour) {
        System.out.println("CHANGING COLOR TO: "+colour);
        this.colour = colour;
    }
}
