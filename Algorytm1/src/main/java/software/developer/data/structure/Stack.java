package software.developer.data.structure;

public interface Stack<T> {


    public T pop();

    public void push(T value);

    //return first element without removing it
    public T peak();

    public boolean isFull();

    public boolean idEmpty();
}
