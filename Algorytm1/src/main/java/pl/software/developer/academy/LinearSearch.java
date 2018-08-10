package pl.software.developer.academy;

import java.util.NoSuchElementException;

public class LinearSearch implements Search {

    private int compareCounter = 0;

    public int search(int [] array, int x) {
        if (array!=null) {
            for (int number : array) {
                if (x == number) {
                    return number;
                }  else {
                    compareCounter++;
                }
            }
        }
        throw new NoSuchElementException("There is no element "+x);
    }

    public int getCompareCounter() {
        return compareCounter;
    }
}
