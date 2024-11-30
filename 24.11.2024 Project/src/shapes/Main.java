package shapes;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00"); // форматирование с 2 знаками после запятой
        // Прочие фигуры
        Circle circle = new Circle(5);
        Square square = new Square(4);
        GenericTriangle genericTriangle = new GenericTriangle(3, 4, 5);
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(4, 3);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(6);
        RightTriangle rightTriangle = new RightTriangle(3, 4);
        Oval oval = new Oval(5, 3);
        Hexagon hexagon = new Hexagon(4);
        Pentagon pentagon = new Pentagon(3);

        // Фигуры четырехугольников
        ConvexQuadrilateral convexQuadrilateral = new ConvexQuadrilateral(5, 6, 7, 8);
        Parallelogram parallelogram = new Parallelogram(5, 4, 3);
        Rectangle rectangle = new Rectangle(4, 5);
        Rhombus rhombus = new Rhombus(4, 3);
        Trapezoid trapezoid = new Trapezoid(5, 7, 4);

        // Тестируем каждую фигуру
        System.out.println(circle);
        System.out.println("Area: " + df.format(circle.getArea()));
        System.out.println("Circumference: " + df.format(circle.getCircumference()));
        System.out.println();

        System.out.println(square);
        System.out.println("Area: " + df.format(square.getArea()));
        System.out.println("Perimeter: " + df.format(square.getPerimeter()));
        System.out.println();

        System.out.println(genericTriangle);
        System.out.println("Area: " + df.format(genericTriangle.getArea()));
        System.out.println("Perimeter: " + df.format(genericTriangle.getPerimeter()));
        System.out.println();

        System.out.println(isoscelesTriangle);
        System.out.println("Area: " + df.format(isoscelesTriangle.getArea()));
        System.out.println("Perimeter: " + df.format(isoscelesTriangle.getPerimeter()));
        System.out.println();

        System.out.println(equilateralTriangle);
        System.out.println("Area: " + df.format(equilateralTriangle.getArea()));
        System.out.println("Perimeter: " + df.format(equilateralTriangle.getPerimeter()));
        System.out.println();

        System.out.println(rightTriangle);
        System.out.println("Area: " + df.format(rightTriangle.getArea()));
        System.out.println("Perimeter: " + df.format(rightTriangle.getPerimeter()));
        System.out.println();

        System.out.println(oval);
        System.out.println("Area: " + df.format(oval.getArea()));
        System.out.println("Circumference: " + df.format(oval.getCircumference()));
        System.out.println();

        System.out.println(hexagon);
        System.out.println("Area: " + df.format(hexagon.getArea()));
        System.out.println("Perimeter: " + df.format(hexagon.getPerimeter()));
        System.out.println();

        System.out.println(pentagon);
        System.out.println("Area: " + df.format(pentagon.getArea()));
        System.out.println("Perimeter: " + df.format(pentagon.getPerimeter()));
        System.out.println();

        System.out.println(convexQuadrilateral);
        System.out.println("Area: " + df.format(convexQuadrilateral.getArea()));
        System.out.println("Perimeter: " + df.format(convexQuadrilateral.getPerimeter()));
        System.out.println();

        System.out.println(parallelogram);
        System.out.println("Area: " + df.format(parallelogram.getArea()));
        System.out.println("Perimeter: " + df.format(parallelogram.getPerimeter()));
        System.out.println();

        System.out.println(rectangle);
        System.out.println("Area: " + df.format(rectangle.getArea()));
        System.out.println("Perimeter: " + df.format(rectangle.getPerimeter()));
        System.out.println();

        System.out.println(rhombus);
        System.out.println("Area: " + df.format(rhombus.getArea()));
        System.out.println("Perimeter: " + df.format(rhombus.getPerimeter()));
        System.out.println();

        System.out.println(trapezoid);
        System.out.println("Area: " + df.format(trapezoid.getArea()));
        System.out.println("Perimeter: " + df.format(trapezoid.getPerimeter()));
    }
}
