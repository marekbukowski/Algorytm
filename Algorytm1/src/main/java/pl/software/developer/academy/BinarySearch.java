package pl.software.developer.academy;

import java.util.NoSuchElementException;

public class BinarySearch implements Search {

    private int compareCounter = 0;

    private int search(int[] input, int leftIndex, int rightIndex, int x) {
        System.out.println("LEFT INDEX "+leftIndex +" RIGHT INDEX "+rightIndex);
        if (rightIndex >= leftIndex)
        {
            int midIndex = leftIndex + (rightIndex - leftIndex)/2;
            System.out.println("MID INDEX "+midIndex);
            // If the element is present at the middle itself
            if (input[midIndex] == x)  return midIndex;

            // If element is smaller than mid, then it can only be present
            // in left subarray
            if (input[midIndex] > x) {
                System.out.println("left subarray left index="+leftIndex+ " right index="+(midIndex-1));
                compareCounter++;
                return search(input, leftIndex, midIndex-1, x);
            }

            compareCounter++;
            System.out.println("right subarray left index="+(midIndex+1)+ " right index="+rightIndex);
            // Else the element can only be present in right subarray
            return search(input, midIndex+1, rightIndex, x);
        }
        throw new NoSuchElementException("There is no element with value"+x);
    }

    public int search(int [] input, int x) {
        return search(input,0, input.length-1,x);
    }

    public int getCompareCounter() {
        return compareCounter;
    }
}
