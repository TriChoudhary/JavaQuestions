package JavaQuestions;
//● Write a Java program named Car
//
//● The Car class should have the following attributes: make (String), model (String) ,
//          year (short) , and price(int) .
//
//        ● The car class should have a constructor that takes all the attributes.
//
//        ● Add a main method to instantiate car objects.
//
//        ● The program should allow the user to create and display objects of each Car Class.

public class Car {
    String Car_make;
    String model;
    short year;
    int price;

    public Car(String car_make, String model, short year, int price) {
        Car_make = car_make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Car_make='" + Car_make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public static  void main(String []args){
        Car nexon = new Car("Tata", "Nexon",(short)2022 , 15000);
        System.out.println(nexon);
    }

}
