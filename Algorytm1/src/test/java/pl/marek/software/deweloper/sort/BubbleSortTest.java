package pl.marek.software.deweloper.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void sort() {
        Sort sort = new BubbleSort();
        int[] input = {5, 3, 4, 9, 2, 17, 11, 1};
        System.out.println("Array before bubble sort " + Arrays.toString(input));
        sort.sort(input);
        System.out.println("Array after bubble sort " + Arrays.toString(input));

    }

    @Test
    public void sortWithoutSwap() {
        Sort sort = new BubbleSortWithoutSwapped();
        int[] input = {5, 3, 4, 9, 2, 17, 11, 1};
        System.out.println("Array before bubble sort " + Arrays.toString(input));
        sort.sort(input);
        System.out.println("Array after bubble sort " + Arrays.toString(input));


    }
}