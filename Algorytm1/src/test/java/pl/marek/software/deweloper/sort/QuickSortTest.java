package pl.marek.software.deweloper.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {
    @Test
    public void sort() {

        QuickSort quickSort = new QuickSort();
        int[] input = {5, 3, 4, 9, 2, 17, 11, 1, 6, 78, 45, 12};
        System.out.println("Array before quick sort " + Arrays.toString(input));
        quickSort.sort(input);
        System.out.println("Array after quick sort " + Arrays.toString(input));
    }
}