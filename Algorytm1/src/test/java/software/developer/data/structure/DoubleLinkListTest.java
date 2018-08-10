package software.developer.data.structure;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleLinkListTest {
    @Test
    public void push() {
        DoubleLinkList<Float> list = new DoubleLinkList<Float>();
        list.push(4.22F);
        list.push(8.72F);
        list.push(12.21F);
        list.push(5.92F);
        list.printReverse();
    }

    @Test
    public void insertAfter() {
        DoubleLinkList<Float> list = new DoubleLinkList<Float>();
        list.push(4.22F);
        list.push(8.72F);
        list.push(12.21F);
        list.push(5.92F);
        list.print();
    }

    @Test
    public void print()  {
    }

    @Test
    public void append()  {
        DoubleLinkList<Float> list = new DoubleLinkList<Float>();
        list.push(4.22F);
        list.push(8.72F);
        list.push(12.21F);
        list.push(5.92F);
        list.append(9.99F);
        list.print();
    }

    @Test
    public void shouldDelete()  {
        DoubleLinkList<String> list = new DoubleLinkList<String>();
        list.push("Kraków");
        list.push("Warsaw");
        list.push("Lublin");
        list.append("Kielce");
        list.delete("Kraków");
        list.print();
    }
}
