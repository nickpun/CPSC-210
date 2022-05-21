package ui;

public class School {

    public static void main(String[] args) {
        School school = new School();
        Learner person = new Student();
        school.serveCoffee(person); //why is person not compiling? serveCoffee requires actual type Student
        school.teach(person);
    }

    public void serveCoffee(Student student){
        student.drinkCoffee();
    }

    public void teach(Learner learner){
        learner.learn();
        learner.drinkCoffee(); //why can't we call this method? Learners don't drink coffee
    }

}

interface Learner{
    void learn();
}
class Student implements Learner{
    public void learn(){}
    public void drinkCoffee(){}
}
// Learner is apparent/declared and Student is actual types