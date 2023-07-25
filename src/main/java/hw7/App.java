package hw7;

public class App {
    public static void main(String[] args) {
        String[][] testArray = {
                {"10", "10", "10", "10"},
                {"10", "10", "10", "10"},
                {"10", "10", "10", "10"},
                {"10", "10", "10", "10"}
        };

        try {
            ArrayValueCalculator calculator = new ArrayValueCalculator();
            int result = calculator.doCalc(testArray);
            System.out.println("Result: " + result);
        } catch (ArraySizeException ase) {
            System.out.printf("ArraySizeException %s, \ntime: %tT ", ase.getMessage(), ase.getLocalDateTime());
        } catch (ArrayDataException ade) {
            System.out.printf("ArrayDataException %s, %nname of the wrong data element: %s, \ntime: %tT ", ade.getMessage(), ade.getName(), ade.getLocalDateTime());
        }
    }
    }
