package pl.soft.developer.academy;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberCounterTest {
    @Test
    public void findMaxOccurances() throws Exception {

        NumberCounter numberCounter = new NumberCounter();
        int [] input = {0,3,4,8,4,2,4,3,1,2,2,8,8,8,0};
        int value = numberCounter.findMaxOccurances(input);
        System.out.println("Most frequent value was: " + value);
    }

}