package JavaQuestions.Inheritance;

public class Bike extends Vehicle {

    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    public void drive() {
        System.out.println(this.make + " " + this.model + " Bike is driving" );
    }

}