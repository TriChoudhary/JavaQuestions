package JavaQuestions.Inheritance;
public class Circle extends Shape {
    int radius;
    @Override
    void calculateArea() {
        System.out.println("Area of a Ciircle "+3.14*radius*radius);
    }
    public Circle(int radius) {
        super();
        this.radius = radius;
    }

}
