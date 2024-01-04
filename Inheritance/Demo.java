package JavaQuestions.Inheritance;

public class Demo {
    public static void main(String[] args) {
    //First Question
        Bike b=new Bike("RE", "Meteor", 2023, 150);
        b.drive();
        Car c=new Car("Tata","Nexon",2023,250);
        c.drive();
    //Second Question
        Circle cc = new Circle(5);
        cc.calculateArea();
        Rectangle R = new Rectangle(4,5);
        R.calculateArea();
    }
}
