package JavaQuestions.Inheritance;

public class Car extends Vehicle{

    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);

    }
    public void drive() {
        System.out.println(this.make + " " + this.model + " Car is driving" );
    }
}

