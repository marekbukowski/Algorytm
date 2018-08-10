package pl.soft.developer.academy;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class LinearSearchTest {

    @Test
    public void shouldfindElement() {
        Search linearSearch = new LinearSearch();
        int [] input = {4,2,5,8,4,64,45,23};
        boolean found = linearSearch.findElement(45, input);
        System.out.println("Number o steps used to find element " + linearSearch.getStepCounter());
        Assert.assertEquals("Should find value", true, found);
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldNotFindElement(){
        LinearSearch linearSearch = new LinearSearch();
        int [] input = {4,2,5,8,4,64,45,23};
        boolean found = linearSearch.findElement(15, input);


    }

}