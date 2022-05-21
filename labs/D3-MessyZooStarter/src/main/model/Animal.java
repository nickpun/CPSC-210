package model;

public class Animal {
    private String name;
    private String hunger;
    private String diet;
    private boolean sleeping;

    public Animal(String name, String diet){
        this.name=name;
        hunger ="hungry";
        this.diet=diet;
    }
    public String getName() {
        return name;
    }

    public String getHunger() {
        return hunger;
    }

    public String getDiet() {
        return diet;
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void reset(){
        System.out.println(this.name+" is hungry and awake!");
        sleeping=false;
        hunger ="hungry";
    }
    public void feed(){
        if (diet.equals("carnivore")) {
            System.out.println(this.name + " is fed meat!");
        }
        if (diet.equals("herbivore")) {
            System.out.println(this.name + " is fed veggies!");
        }
        if (diet.equals("omnivore")) {
            System.out.println(this.name + " is fed veggies and meat!");
        }
        hunger = "fed";
    }

    public void putToBed() {
        System.out.println(this.name+" is being put to bed!");
        sleeping=true;
    }
}
