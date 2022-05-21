package ui;

import java.util.Random;

public class Fun {
    public static void main (String[] args) {
        Fun fun = new Fun();
        fun.run();
    }
    void run() {
        Bridge b = new Bridge (11);

        Truck t  = new Truck (10, "Purolator ");
        b.checkFits(t);

        TRex r = new TRex (12);
        b.checkFits(r);

        Transformer t0 = new Transformer(10, 12); // runs transformer getHeight method
        Measurable t1 = new Transformer(10, 12); // runs transformer getHeight method
        Measurable m = new Measurable(); // runs Measurable getHeight method
    }
}

//interface Measurable {
//    int getHeight();
//}

class Measurable {
    private int height;

    public Measurable (int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
}

class Bridge {
    int maxHeight;
    Bridge (int maxHeight) {
        this.maxHeight = maxHeight;
    }
    void checkFits(Measurable m) {
        if (m.getHeight() <= maxHeight) {
            System.out.println("FITS");
        } else {
            System.out.println("DOES NOT FIT");
        }
    }
}

//class Truck implements Measurable {
//    int height;
//    String owner;
//    Truck (int height, String owner) {
//        this.height = height;
//        this.owner = owner;
//    }
//    @Override
//    public int getHeight() {
//        return height;
//    }
//    public String getOwner() {
//        return owner;
//    }
//}

class Truck extends Measurable {
    String owner;
    Truck (int height, String owner) {
        super(height);
        this.owner = owner;
    }
    public String getOwner() {
        return owner;
    }
}

//class TRex implements Measurable {
//    int height;
//    TRex(int height) {
//        this.height = height;
//    }
//    @Override
//    public int getHeight() {
//        return height;
//    }
//}

class TRex extends Measurable {
    boolean isTrapped;
    TRex(int height) {
        super(height);
    }
}

// use interface when +2 classes have similar methods but they do different things
// use extend when +2 classes have exactly the same methods

class Transformer extends Measurable {
    int min, max;
    Random random;
    Transformer(int min, int max) {
        super(-1)
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    // Override to implement a method to do something new than what is defined in the superclass
    @Override
    public int getHeight() {
        return random.nextInt(max-min+1);
    }
}

class DangerousTruck extends Truck {
    int tolerance;
    DangerousTruck(int height, String owner, int tolerance) {
        super(height, owner);
        this.tolerance = tolerance;
    }

    @Override
    public int getHeight() {
        return super.getHeight() + this.tolerance;
    }
}