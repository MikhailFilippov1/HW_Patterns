package MultiformityExample;

public class Triangle implements Shape{
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void getSquare() {
        float p = (a + b + c)/2;
        float S = p * (p - a) * (p - b) * (p - c);
        System.out.printf("S треугольника = %.2f \n", S);
    }

    @Override
    public void getPerimeter() {
        System.out.printf("Периметр треугольника = %.2f \n", a + b + c);
    }
}
