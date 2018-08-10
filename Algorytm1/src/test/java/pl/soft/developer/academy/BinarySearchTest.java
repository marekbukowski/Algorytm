package pl.soft.developer.academy;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void shoudfindElement() {

        Search search = new BinarySearch();
        int [] input = {4,2,5,8,4,64,45,23};
        boolean found = search.findElement(45, input);
        System.out.println("Number o steps used to find element " + search.getStepCounter());
        Assert.assertEquals("Should find value ", true, found);

    }

    @Test(expected = NoSuchElementException.class)
    public void shoudNotfindElement() {

        Search search = new BinarySearch();
        int[] input = {4, 2, 5, 8, 4, 64, 45, 23};
        boolean found = search.findElement(22, input);
    }
}