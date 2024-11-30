package shapes;

public class Parallelogram extends Quadrilateral{
    private double height;

    public Parallelogram(double base, double side, double height) {
        super(base, side, base, side);
        this.height = height;
    }

    @Override
    public double getArea() {
        return sideA * height; // Площадь = основание * высота
    }

    @Override
    public String toString() {
        return "Parallelogram with base " + sideA + ", side " + sideB + " and height " + height;
    }
}
