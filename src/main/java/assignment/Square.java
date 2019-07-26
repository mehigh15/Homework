package assignment;


import java.util.Objects;

public class Square implements Shape {
    private final double length;


    public Square(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Square)) {
            return false;
        }
        Square square = (Square) o;
        return length == square.length;

    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

    @Override
    public double calculatePerimeter() {
        return +(length * 4);

    }


    @Override
    public double calculateArea() {
        return +(length * length);
    }


}
