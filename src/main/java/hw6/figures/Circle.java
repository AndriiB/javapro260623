package hw6.figures;

public class Circle implements Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double figureArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public double getRadius() {
        return radius;
    }
}

