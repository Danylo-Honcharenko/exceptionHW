import exceptions.ArrayDataException;
import exceptions.ArraySizeException;

public class ArrayValueCalculator {
    public static int doCalc(String[][] inputArray) throws ArraySizeException, ArrayDataException {
        if (inputArray.length != 4) throw new ArraySizeException();
        int total = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                try {
                    int amount = Integer.parseInt(inputArray[i][j]);
                    total += amount;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data in row " + i + ", column " + j);
                }
            }
        }

        return total;
    }
}
