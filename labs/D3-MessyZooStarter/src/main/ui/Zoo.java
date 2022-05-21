package ui;

import model.Animal;

import java.util.ArrayList;

public class Zoo {
    private String keeper;
    private String cleaner;
    private String receptionist;
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<String> callers = new ArrayList<>();


    public static void main(String[] args){
        Zoo messyZoo = new Zoo("Jeckyl", "Hyde", "Frankenstein");
        messyZoo.run();
    }

    public Zoo(String keeper, String cleaner, String receptionist){
        this.keeper = keeper;
        this.cleaner = cleaner;
        this.receptionist = receptionist;
    }

    private void run() {

        animals.add(new Animal("Koala", "herbivore", 200));
        animals.add(new Animal("Wolverine", "omnivore", 300));
        animals.add(new Animal("Dragon", "carnivore",1000));

        //Do one day of stuff:

        //reset all the animals back to being hungry
        System.out.println(keeper +" is now resetting the animals");
        for (Animal a : animals) {
            a.reset();
        }
        //feed all the animals in the morning
        System.out.println(keeper +" is now feeding the animals");
        for (Animal a : animals){
            a.feed();
            //now this animal shouldn't be hungry
        }
        //now the animals have messed up their stalls!
        System.out.println(cleaner +" is now resetting the stalls");
        for (Animal a : animals){
            a.resetStall();
            //now this animal's stall stall should be a mess
        }

        System.out.println(cleaner +" is now cleaning the stalls");
        //clean all the stalls out
        for (Animal a : animals){
            a.cleanStall();
            //now this animal should have a clean stall
            //and the animal should be hungry
        }

        System.out.println(keeper +" is now resetting the animals");
        //reset all the animals back to being hungry for their evening meal
        for (Animal a : animals) {
            a.reset();
        }

        System.out.println(keeper +" is now feeding the animals");
        //feed all the animals at night
        for (Animal a : animals){
            a.feed();
            //now this animal shouldn't be hungry
        }

        System.out.println(keeper +" is now putting the animals to bed");
        for (Animal a : animals){
            a.putToBed();
            //now this animal shouldn't be hungry
        }


        //print out the reports for the animals for the day.
        for (Animal a : animals) {
            String status = a.getHunger()+" and "+a.getStallStatus();
            System.out.println("----->This is a daily report for Animal: " + a.getName()+".");
            System.out.println("----->As of this time, " + a.getName()+" is:");
            System.out.println("----->...................................." + status);
            System.out.println("----->End of report");
        }

        callers.add("Kristen");
        callers.add("Edward");
        callers.add("Jacob");

        System.out.println(receptionist+" is now handling the calls");
        //process callers
        for (String caller : callers){
            //deal with the caller
            System.out.println("Hello, "+caller+", how might I help you?");
            //make a report about the call
            System.out.println("----->This is a report for Caller: "+caller);
            System.out.println("----->Caller requisitioned animals to join their team");
            System.out.println("----->Request was denied");
            System.out.println("----->End of report");
        }
    }
}
