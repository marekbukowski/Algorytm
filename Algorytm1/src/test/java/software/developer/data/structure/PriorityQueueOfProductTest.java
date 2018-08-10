package software.developer.data.structure;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;

public class PriorityQueueOfProductTest {

    @Test
    public void shouldProductInCorrectOrder(){
        Queue <Product> queue = new PriorityQueue<Product>();
        queue.add(new Product("iphone", new BigDecimal("1.22")));
        queue.add(new Product("logiteh mouse", new BigDecimal("0.23")));
        queue.add(new Product("laptop", new BigDecimal("3.22")));
        queue.add(new Product("milk", new BigDecimal("0.10")));

        PrintQueue(queue);

        System.out.println("Removing element");
        queue.remove();
        PrintQueue(queue);

        System.out.println("Peek element");
        Product product = queue.peek();
        System.out.println("Peeked product" + product);
        PrintQueue(queue);

    }

    private void PrintQueue(Queue<Product> queue) {
        Iterator iterator = queue.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
