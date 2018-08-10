package pl.marek.software.deweloper.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test
    public void sort() {

        Sort sort = new InsertionSort();
        int[] input = {5, 3, 4, 9, 2, 17, 11, 1};
        System.out.println("Array before insertion sort " + Arrays.toString(input));
        sort.sort(input);
        System.out.println("Array after insertion sort " + Arrays.toString(input));
    }
}