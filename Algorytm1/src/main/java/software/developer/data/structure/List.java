package software.developer.data.structure;

public interface List<T> {

    public void push(T data);

    public void insertAfter(Node previousode, T data);

    public void print();

    public void append(T data);

    public void delete(T key);

}
