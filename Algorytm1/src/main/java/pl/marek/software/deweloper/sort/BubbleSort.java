package pl.marek.software.deweloper.sort;

import java.util.Arrays;

public class BubbleSort implements Sort {
    @Override
    public void sort(int[] input) {
        int lenght = input.length;
        boolean swapped = false;
        int stepCounter = 0;

        do {
            swapped = false;

            for (int i = 1; i < lenght; i++) {
                if (input[i-1] > input[i]) {
                    System.out.println("Substitute element " + input[i-1]+" "+ "to element " + input[i]);
                    int tmp = input[i-1];
                    input[i-1] = input [i];
                    input[i]= tmp;

                }
                stepCounter++;
            }
            System.out.println(Arrays.toString(input));
            lenght = lenght - 1;
        } while (lenght > 1 && swapped);
        System.out.println("Steps needed to sort array using bubble sort with swapped " + stepCounter);

    }
}


