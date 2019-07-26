package assignment;

import java.util.Objects;

public class Rectangle implements Shape {

    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return length == rectangle.length && width == rectangle.length;


    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public double calculatePerimeter() {
        return +(2 * width + 2 * length);
    }

    @Override
    public double calculateArea() {
        return +(width * length);
    }

}
