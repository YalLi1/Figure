package shapes;

public class ConvexQuadrilateral extends Quadrilateral{
    public ConvexQuadrilateral(double sideA, double sideB, double sideC, double sideD) {
        super(sideA, sideB, sideC, sideD);
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2; // Полупериметр
        return Math.sqrt((s - sideA) * (s - sideB) * (s - sideC) * (s - sideD)); // Формула Брахмагупты
    }

    @Override
    public String toString() {
        return "Convex " + super.toString();
    }
}
