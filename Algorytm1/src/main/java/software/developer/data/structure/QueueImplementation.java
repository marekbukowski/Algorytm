package software.developer.data.structure;

import java.util.LinkedList;

public class QueueImplementation<T> implements Queue<T> {

    private LinkedList<T> list = new LinkedList<T>();

    @Override
    public void enqueue(T element) {
        list.add(element);
    }

    @Override
    public T dequeue() {
        return list.poll();
    }

    @Override
    public boolean hasElements() {
        return !list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}
