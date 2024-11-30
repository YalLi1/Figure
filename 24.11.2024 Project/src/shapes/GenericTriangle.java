package shapes;

public class GenericTriangle extends Triangle{
    public GenericTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double getArea() {
        // Использование формулы Герона для вычисления площади
        double s = getPerimeter() / 2; // Полупериметр
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Формула Герона
    }

    @Override
    public String toString() {
        return "Generic " + super.toString();
    }
}
