package shapes;

public class Pentagon {
    private double side;

    public Pentagon(double side) {
        this.side = side;
    }

    public double getArea() {
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5)); // Площадь = (5 * a^2) / (4 * tg(π/5))
    }

    public double getPerimeter() {
        return 5 * side; // Периметр = 5 * a
    }

    @Override
    public String toString() {
        return "Pentagon with side " + side;
    }
}
