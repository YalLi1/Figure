package shapes;

public class Trapezoid extends Quadrilateral{
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double base1, double base2, double height) {
        super(base1, base2, height, height);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2; // Площадь = (b1 + b2) * h / 2
    }

    @Override
    public String toString() {
        return "Trapezoid with bases " + base1 + " and " + base2 + " and height " + height;
    }
}
