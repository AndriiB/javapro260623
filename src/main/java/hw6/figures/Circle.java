package hw6.figures;

public class Circle implements Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double figureArea() {
        return Math.PI * radius * radius;
    }
}
