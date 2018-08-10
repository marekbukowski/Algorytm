package pl.developer.tree.structure;

public class Node<T> {

    T data;

    public Node<T> leftChild;
    public Node<T> rightChild;

    public T getData() {
        return data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public Node(T data) {
        this.data = data;
        //at first child is null
        this.leftChild = null;
        this.rightChild = null;

        }
        }
