package shapes;

public class Oval {
    private double semiMajorAxis; // Наибольший радиус (полуоси)
    private double semiMinorAxis; // Наименьший радиус (полуоси)

    public Oval(double semiMajorAxis, double semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    public double getArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis; // Площадь = π * a * b
    }

    public double getCircumference() {
        // Приближенная формула для вычисления длины овала (эллипса)
        return Math.PI * (3 * (semiMajorAxis + semiMinorAxis) - Math.sqrt((3 * semiMajorAxis + semiMinorAxis) * (semiMajorAxis + 3 * semiMinorAxis)));
    }

    @Override
    public String toString() {
        return "Oval with semi-major axis " + semiMajorAxis + " and semi-minor axis " + semiMinorAxis;
    }
}
