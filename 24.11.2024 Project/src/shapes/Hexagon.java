package shapes;

public class Hexagon {
    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    public double getArea() {
        return (3 * Math.sqrt(3) / 2) * side * side; // Площадь = (3√3/2) * a^2
    }

    public double getPerimeter() {
        return 6 * side; // Периметр = 6 * a
    }

    @Override
    public String toString() {
        return "Hexagon with side " + side;
    }
}
