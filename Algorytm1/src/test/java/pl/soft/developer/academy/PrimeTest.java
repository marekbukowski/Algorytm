package pl.soft.developer.academy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeTest {
    @Test
    public void isPrime17() throws Exception {

        Prime prime = new Prime(17);
        Assert.assertEquals(prime.getValue()+ "is not prime numeber", true, prime.isPrime());
    }


    @Test
    public void isPrime15() throws Exception {

        Prime prime = new Prime(15);
        Assert.assertEquals(prime.getValue()+ "is not prime numeber", false, prime.isPrime());
    }
}