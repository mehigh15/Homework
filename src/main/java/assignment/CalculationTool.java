package assignment;

import java.util.ArrayList;


public class CalculationTool {
    private double perimeter;
    private double area;
    ArrayList<Double> perimeters = new ArrayList<>();
    ArrayList<Double> areas = new ArrayList<>();
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void calculate() {
        for (Shape shape : shapes) {
            this.perimeter = shape.calculatePerimeter();
            perimeters.add(perimeter);
            this.area = shape.calculateArea();
            areas.add(area);
        }
        double sum = 0;
        for (Double d : perimeters)
            sum += d;
        System.out.println("Perimeters'sum:" + (sum));
        double sum2 = 0;
        for (Double d1 : areas)
            sum2 += d1;
        System.out.println("Areas'sum:" + (sum2));
    }


    public static void main(String[] args) {
        CalculationTool calculation = new CalculationTool();

        Circle c = new Circle(1);
        calculation.addShape(c);
        System.out.println("Circle perimeter is:" + (c.calculatePerimeter()));
        System.out.println("Circle area is:" + (c.calculateArea()));

        Circle c1 = new Circle(3);
        calculation.addShape(c1);
        System.out.println("Circle's perimeter is:" + (c1.calculatePerimeter()));
        System.out.println("Circle's area is:" + (c1.calculateArea()));


        Triangle t = new Triangle(3, 4, 5);
        calculation.addShape(t);
        System.out.println("Triangle's perimeter is:" + (t.calculatePerimeter()));
        System.out.println("Triangle's area is:" + (t.calculateArea()));


        Rectangle r = new Rectangle(3, 4);
        calculation.addShape(r);
        System.out.println("Rectangle's perimeter is:" + (r.calculatePerimeter()));
        System.out.println("Rectangle's area is:" + (r.calculateArea()));


        Square s = new Square(4);
        calculation.addShape(s);
        System.out.println("Square's perimeter is:" + (s.calculatePerimeter()));
        System.out.println("Square's area is:" + (s.calculateArea()));


        Square s1 = new Square(4);
        System.out.println("There is a duplicate:" + (s1.equals(s)));

        Square s2 = new Square(5);
        System.out.println("There is a duplicate:" + (s2.equals(s1)));

        calculation.calculate();


    }
}
