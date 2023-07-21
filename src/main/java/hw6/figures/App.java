package hw6.figures;

public class App {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(10.0);
        figures[1] = new Triangle(5.0, 3.0);
        figures[2] = new Square(7.5);

        double totalArea = calculateTotalArea(figures);
        System.out.println("Total area of all figures: " + totalArea);
    }

        public static double calculateTotalArea(Figure[] figures) {
            double totalArea = 0.0;
            for (Figure figure : figures) {
                totalArea += figure.figureArea();
            }
            return totalArea;
        }
    }
