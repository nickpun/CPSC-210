package model;

public class Stall {
    private String stallStatus;
    private int stallSquareFeet;

    public Stall(int stallSize){
        stallStatus = "messy";
        this.stallSquareFeet = stallSize;
    }

    public void resetStall(){
        System.out.println(this.name+" has a messy stall!");
        stallStatus="messy";
    }
    public void cleanStall(){
        for (int i=0; i<stallSquareFeet; i++){
            System.out.print(".");
        }
        System.out.println("\n"+this.name+" has a clean stall!");
        stallStatus="clean";
    }

    public int getStallSquareFeet() {
        return stallSquareFeet;
    }

    public String getStallStatus() {
        return stallStatus;
    }
}
