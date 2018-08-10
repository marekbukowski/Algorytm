package pl.marek.software.deweloper.sort;

import java.util.Arrays;

public class InsertionSort implements Sort {

    @Override
    public void sort(int[] input) {

        int i;
        for (i = 1; i< input.length;i++){
            int key =input[i];
            int j= i - 1; //previous element
            while (j>=0 && input[j]>key) {
                //array offset
                input[j + 1] = input[j];
                // decreate marker
                j = j - 1;
            }
                input[j+1] = key;
            System.out.println(Arrays.toString(input));
            }
        }
    }
