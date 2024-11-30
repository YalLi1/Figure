package shapes;

public abstract class Triangle {
    protected double a, b, c;

    public Triangle(double a, double b, double c) {
        // Проверка на существование треугольника по неравенству треугольника
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Стороны не могут образовать треугольник");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public abstract double getArea();

    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle with sides: " + a + ", " + b + ", " + c;
    }

}
