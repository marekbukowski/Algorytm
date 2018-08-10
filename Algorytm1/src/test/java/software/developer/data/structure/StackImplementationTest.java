package software.developer.data.structure;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackImplementationTest {

    @Test
    public void pop() {

    }

    @Test
    public void pushshouldPushValueOnStac() {
        Stack stack = new StackImplementation(5);
        stack.push(3);
        stack.push(6);

        Assert.assertEquals(6, stack.pop());
    }

    @Test
    public void peak() {
        Stack stack = new StackImplementation(5);
        stack.push(3);
        stack.push(6);

        Assert.assertEquals(4,stack.peak());
    }

    @Test
    public void isFull() {

        Stack stack = new StackImplementation(2);
        stack.push(5);
        stack.push(4);



    }


    @Test
    public void idEmpty(){
    }

}