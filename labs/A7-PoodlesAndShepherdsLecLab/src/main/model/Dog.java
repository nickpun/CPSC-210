package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Dog {
    private String name;
    private List<String> schedule;

    //EFFECTS: creates a new German Shepherd with a 24 hour schedule capacity
    public Dog(String name){
        this.name = name;
        this.schedule = new ArrayList<>(24);
        for (int i=0; i<24; i++){
            this.schedule.add(i, "free");
        }
    }

    //EFFECTS: prints and returns "yip yip yip"
    public abstract String bark();
    public abstract String greet();

    //REQUIRES: a time between 0 and 23
    //MODIFIES: this
    //EFFECTS:  adds the thing to add to the schedule,
    //          prints out what has been added and when
    public void addToSchedule(String thingToAdd, int time){
        System.out.println("Adding "+thingToAdd+" to schedule at "+time);
        schedule.set(time, thingToAdd);
    }

    //EFFECTS: prints out the schedule
    public String printSchedule(){
        String scheduleStr = name + "'s schedule: " + schedule;
        System.out.println(scheduleStr);
        return scheduleStr;
    }
}
