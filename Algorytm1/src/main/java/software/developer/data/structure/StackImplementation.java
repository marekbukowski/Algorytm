package software.developer.data.structure;

public class StackImplementation<T> implements Stack<T> {

    private int maxSize;

    private T [] stackArray;

    private int top;

    public StackImplementation(int maxSize) {
        this.maxSize = maxSize;
        stackArray = (T[]) new Object[maxSize];
        top= -1;
    }

    @Override
    public T pop() {
        int currnetTop = top;
        top = top -1;
        return stackArray[currnetTop];
    }

    @Override
    public void push(T value) {
        //increate top marker
        top = top + 1;
        stackArray[top] = value;

    }

    @Override
    public T peak() {
        return stackArray[top];

    }

    @Override
    public boolean isFull() {
        return (top == maxSize);
    }

    @Override
    public boolean idEmpty() {
        return (top == -1);
    }
}
