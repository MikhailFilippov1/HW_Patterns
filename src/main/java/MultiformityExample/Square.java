package MultiformityExample;

public class Square implements Shape{
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void getSquare() {
        System.out.println("S квадрата = " + a * a);
    }

    @Override
    public void getPerimeter() {
        System.out.println("Периметр квадрата = " + a * 4);
    }
}
