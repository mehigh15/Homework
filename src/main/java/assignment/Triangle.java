package assignment;

import java.util.Objects;

public class Triangle implements Shape {
    private double length1, length2, length3;


    public Triangle(double length1, double length2, double length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;

    }


    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Triangle)) {
            return false;
        }
        Triangle triangle = (Triangle) o;
        return length1 == triangle.length1 && length2 == triangle.length2 && length3 == triangle.length3;

    }

    @Override
    public int hashCode() {
        return Objects.hash(length1, length2, length3);
    }

    @Override
    public double calculatePerimeter() {
        double b = length1 + length2 + length3;
        return b;
    }


    @Override
    public double calculateArea() {
        double a = (length1 + length2 + length3) / 2;
        return (Math.sqrt(a * (a - length1) * (a - length2) * (a - length3)));
    }
}
