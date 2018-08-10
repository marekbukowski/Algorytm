package pl.marek.software.deweloper.sort;

import java.util.Arrays;

public class SelectionSort implements Sort{

    @Override
    public void sort(int[] input) {

        //int length = input.length;

        for (int i=0; i<input.length;i++){
            int minIndex = i;

            //process unsorted table anf find minimal index
            for (int j=i+1;j<input.length;i++){
                if (input[j]<input[minIndex]){
                    minIndex = j;
                }
            }
            System.out.println("Current minimal index: " +minIndex+" "+input[minIndex]);
            //swap minIndex current one (element i)
            swap(input, i, minIndex);
            System.out.println(Arrays.toString(input));
        }
    }

    private void swap(int[] input, int i, int minIndex) {
        if (i!=minIndex){
            int tmp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = tmp;
        }
    }
}
