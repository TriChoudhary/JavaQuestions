package JavaQuestions.Inheritance;
public class Circle extends Shape{
    int radius;
    public Circle(int radius) {
        super();
        this.radius = radius;
    }
    public void getArea() {
        System.out.println("Area of radius "+3.14*radius*radius);
    }
}
