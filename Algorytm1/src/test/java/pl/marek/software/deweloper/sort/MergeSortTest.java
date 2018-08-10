package pl.marek.software.deweloper.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void sorted() {

        int[] array = {5, 3, 4, 9, 2, 17, 11, 1};
        System.out.println("Array before merge sort " + Arrays.toString(array));

        MergeSort sorted = new MergeSort();
        sorted.sort(array, 0, array.length - 1);

        System.out.println("Array after merge sort" + Arrays.toString(array));


    }

}