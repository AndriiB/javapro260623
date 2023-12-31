package hw7;

import java.time.LocalDateTime;

import static java.lang.Integer.parseInt;

public class ArrayValueCalculator {

    public int doCalc(String[][] testArray) throws ArraySizeException, ArrayDataException {

        int testArrayRows = testArray.length;
        int testArrayCols = testArray[0].length;

        for (int i = 1; i < testArrayRows; i++) {
            if (testArray[i].length != testArrayCols) {
                throw new ArraySizeException("Wrong array size! Array must be 4x4", LocalDateTime.now());
            }
        }

        if (testArrayRows != 4 || testArrayCols != 4) {
            throw new ArraySizeException("Wrong array size! Array must be 4x4", LocalDateTime.now());
        }

        int sum = 0;
        for (int i = 0; i < testArray.length; i++ ) {
            for (int j = 0; j < testArray[i].length; j++) {
                try{
                    sum += parseInt(testArray[i][j]);
                } catch(NumberFormatException e) {
                    throw new ArrayDataException("Wrong data format! [in array #: " + (i+1) + "][in element #: " + (j+1) + "]", testArray[i][j], LocalDateTime.now());
                    }
                }
            }
        return sum;
    }
}
