package pl.marek.software.deweloper.sort;

import java.util.Arrays;

public class BubbleSortWithoutSwapped implements Sort{

    @Override
    public void sort(int[] input) {

        int lenght = input.length;
        int stepCouter = 0;


        do {
            for (int i = 1; i < lenght; i++) {
                if (input[i-1] > input[i]) {
                    System.out.println("Substitute element " + input[i-1]+" "+ "to element " + input[i]);
                    int tmp = input[i-1];
                    input[i-1] = input [i];
                    input[i]= tmp;
                }
                stepCouter++;
            }
            System.out.println(Arrays.toString(input));
            lenght = lenght - 1;
        } while (lenght > 1);
        System.out.println("Steps needed to sort array using bubble sort without swapped "+stepCouter);
    }
    }

