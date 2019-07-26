package assignment;

import java.util.Objects;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) o;
        return radius == circle.radius;

    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }


    @Override
    public double calculatePerimeter() {
        return +(2 * Math.PI * radius);
    }

    @Override
    public double calculateArea() {
        return +(Math.PI * radius * radius);
    }
}
