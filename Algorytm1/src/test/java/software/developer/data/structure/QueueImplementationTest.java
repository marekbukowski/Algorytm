package software.developer.data.structure;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueImplementationTest {

    @Test
    public void enqueue() {
        Queue<Integer> queue = new QueueImplementation<>();

        queue.enqueue(5);
        queue.enqueue(4);

        Assert.assertEquals(2, queue.size());
    }

    @Test
    public void dequeue() {
        //Given
        Queue<Integer> queue = new QueueImplementation<>();

        queue.enqueue(5);
        queue.enqueue(4);

        //When
        Integer value = queue.dequeue();
        Assert.assertEquals(Integer.valueOf(5), value);
    }

    @Test
    public void hasElements() {

        Queue<Integer> queue = new QueueImplementation<>();

        queue.enqueue(5);
        queue.enqueue(4);

        Assert.assertEquals(true, queue.hasElements());
    }

    @Test
    public void size() {

        Queue<Integer> queue = new QueueImplementation<>();

        queue.enqueue(5);
        queue.enqueue(4);

        Assert.assertEquals(2, queue.size());
    }
}