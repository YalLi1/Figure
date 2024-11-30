package shapes;

public class Rhombus extends Quadrilateral{
    private double height;

    public Rhombus(double side, double height) {
        super(side, side, side, side);
        this.height = height;
    }

    @Override
    public double getArea() {
        return sideA * height; // Площадь = сторона * высота
    }

    @Override
    public String toString() {
        return "Rhombus with side " + sideA + " and height " + height;
    }
}
