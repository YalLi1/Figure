package shapes;

public class RightTriangle extends Triangle{
    public RightTriangle(double base, double height) {
        super(base, height, Math.sqrt(base * base + height * height)); // c - вычисляется по теореме Пифагора
        this.height = height;
    }

    private double height;

    @Override
    public double getArea() {
        return (a * height) / 2; // Площадь = 1/2 * основание * высота
    }

    @Override
    public String toString() {
        return "Right " + super.toString();
    }
}
