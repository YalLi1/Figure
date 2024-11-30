package shapes;

public abstract class Quadrilateral {
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double sideD;

    public Quadrilateral(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public abstract double getArea(); // Абстрактный метод для вычисления площади

    public double getPerimeter() {
        return sideA + sideB + sideC + sideD; // Периметр = сумма сторон
    }

    @Override
    public String toString() {
        return "Quadrilateral with sides: " + sideA + ", " + sideB + ", " + sideC + ", " + sideD;
    }
}
