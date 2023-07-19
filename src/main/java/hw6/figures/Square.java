package hw6.figures;

public class Square implements Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }


    @Override
    public double figureArea() {
        return side * side;
    }
}
