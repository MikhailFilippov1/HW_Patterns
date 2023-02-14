package MultiformityExample;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void getSquare() {
        System.out.printf("S круга = %.2f \n", 3.14 * radius * radius);
    }

    @Override
    public void getPerimeter() {
        System.out.printf("Длина окружности = %.2f \n", 2 * 3.14 * radius);
    }
}
