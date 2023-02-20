package MultiformityExample;

public class MultiformityExampleApplication {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape triangle = new Triangle(1, 1, 1);
        Shape square = new Square(2);

        circle.getSquare();
        circle.getPerimeter();
        triangle.getSquare();
        triangle.getPerimeter();
        square.getSquare();
        square.getPerimeter();
    }
}
