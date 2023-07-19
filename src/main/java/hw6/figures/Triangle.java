package hw6.figures;

public class Triangle implements Figure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double figureArea() {
        return 0.5 * base * height;
    }
}
