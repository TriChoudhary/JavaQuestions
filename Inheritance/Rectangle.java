package JavaQuestions.Inheritance;

public class Rectangle extends Shape{
    int length;
    int width;
    public Rectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }
    public void calculateArea() {
        System.out.println("Area of Rectangle "+length*width);
    }
}
