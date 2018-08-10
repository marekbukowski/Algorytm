package pl.marek.software.deweloper.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SelectionSortTest {
    @Test
    public void sort() {

        Sort sort = new SelectionSort();
        int[] input = {5, 3, 4, 9, 2, 17, 11, 1};
        System.out.println("Array before selection sort " + Arrays.toString(input));
        sort.sort(input);
        System.out.println("Array after selection sort " + Arrays.toString(input));
    }

}