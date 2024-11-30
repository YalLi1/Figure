package shapes;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double base, double height) {
        super(base, base, Math.sqrt((base / 2) * (base / 2) + height * height)); // c - вычисляется по теореме Пифагора
        this.height = height;
    }

    private double height;

    @Override
    public double getArea() {
        return (a * height) / 2; // Площадь = 1/2 * основание * высота
    }

    @Override
    public String toString() {
        return String.format("Isosceles Triangle with sides: %.2f, %.2f, %.2f", a, a, height);
    }
}
