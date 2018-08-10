package software.developer.data.structure;

import pl.developer.tree.structure.Node;

public interface Queue<T> {

    public void enqueue(T element);

    public T dequeue();

    public boolean hasElements();

    public int size();

}
