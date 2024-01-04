package JavaQuestions.Inheritance;

public class Rectangle extends Shape {
    int width;
    int height;
    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }
    @Override
    public void getArea() {
        System.out.println("Area of this rectangle is "+width*height);
    }
    public static void main(String[] args) {

        Rectangle r=new Rectangle(10, 5);
        r.getArea();

    }
}