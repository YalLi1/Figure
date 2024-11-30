package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side, side, side);
    }

    @Override
    public double getArea() {
        return sideA * sideA; // Площадь = сторона * сторона
    }

    @Override
    public String toString() {
        return "Square with side " + sideA;
    }
}
