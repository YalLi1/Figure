package shapes;

public class Rectangle extends Quadrilateral{
    public Rectangle(double width, double height) {
        super(width, height, width, height);
    }

    @Override
    public double getArea() {
        return sideA * sideB; // Площадь = ширина * высота
    }

    @Override
    public String toString() {
        return "Rectangle with width " + sideA + " and height " + sideB;
    }
}
