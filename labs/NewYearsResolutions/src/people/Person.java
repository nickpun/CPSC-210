package people;

import resolutions.ResolutionMaker;

public class Person {
    ResolutionMaker resolutionMaker = new ResolutionMaker();


    public void getFit(){
        sayResolution();
        resolutionMaker.workOut();
    }

    public void eatBetter(){
        sayQuit();
        resolutionMaker.iceCream();
        sayResolution();
        resolutionMaker.eatSalad();
        sayResolution();
        resolutionMaker.drinkSmoothies();
    }

    public void getSleep(){
        sayResolution();
        resolutionMaker.relaxMore();
        sayQuit();
        resolutionMaker.upLate();
    }


    private void sayResolution(){
        System.out.print("I am going to ....");
    }

    private void sayQuit(){
        System.out.print("I am no longer going to ...");
    }

}
