package Counter;

import Exceptions.MyArrayDataException;
import Exceptions.MySizeArrayException;

public class Counter {
    public static int counter(String[][] Array) throws MySizeArrayException, MyArrayDataException {
        int count = 0;
        if (Array.length != 4) {
            throw new MySizeArrayException("превышен размер");
        }
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(Array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}
