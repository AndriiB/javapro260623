package hw6.figures;

public class Square implements Figure {
    private final double side;

    public Square(double side) {
        this.side = side;
    }


    @Override
    public double figureArea() {
        return Math.pow(side, 2);
    }
}
