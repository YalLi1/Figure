package shapes;

public class EquilateralTriangle extends Triangle{
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * a * a; // Площадь = (√3 / 4) * a^2
    }

    @Override
    public String toString() {
        return "Equilateral " + super.toString();
    }
}
