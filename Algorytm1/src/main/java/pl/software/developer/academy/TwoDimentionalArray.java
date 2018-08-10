package pl.software.developer.academy;

import java.util.Arrays;

public class TwoDimentionalArray {


    public int getRowNumberWithMinimumValue(int [][] input) {
        int minimalMaxValue = -1;
        int index = 0;
        for (int i=0;i<input.length;i++) {
            Arrays.sort(input[i]);
            int tmpMaxValue = input[i][input[i].length-1];
            if (tmpMaxValue < minimalMaxValue ||  minimalMaxValue == -1) {
                minimalMaxValue = tmpMaxValue;
                index = i;
            }
        }
        return index;
    }

    public int getRowNumberWithSameValues(int [][] input) {
        int maxIndex = 0;
        int maxLength = 0;
        for (int i=0;i<input.length;i++) {
            int length = getLongestCoherentFragment(input[i]);
            if (length > maxLength) {
                maxIndex = i;
                maxLength = length;
            }
        }
        return maxIndex;
    }

    private int getLongestCoherentFragment(int [] values) {
        int maxLength = 1;
        int currentLenght = 1;
        for (int i=0; i<values.length ; i++) {
            if (i>0) {
                if (values[i]==values[i-1]) {
                    currentLenght++;
                } else {
                    maxLength = currentLenght;
                    currentLenght = 1;
                }
            }
        }
        return maxLength>currentLenght?maxLength:currentLenght;
    }
}
