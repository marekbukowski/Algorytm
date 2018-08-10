package pl.developer.tree.structure;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {

    private Node<T> root;

    public BinaryTree() {
        root = null;
    }

    public void createRoot(T data) {
        root = new Node<T>(data);
    }

    public Node<T> getRoot() {
        return root;
    }

    public T getRootValue() {
        return root.getData();
    }



    public void printTree() {

        Queue<Node<T>> queue = new LinkedList<Node<T>>();

        queue.add(root);

        while (true) {
            int nodeCountOnLevel = queue.size();
            if (nodeCountOnLevel == 0) {
                break;
            }
            while (nodeCountOnLevel > 0) {
                Node<T> node = queue.peek();
                System.out.print(node.data + " ");
                queue.remove();

                if (node.leftChild != null) {
                    queue.add(node.leftChild);
                }
                if (node.rightChild != null) {
                    queue.add(node.rightChild);
                }
                nodeCountOnLevel--;

            }
            System.out.println();
        }
    }

    public void traverseInOrder(Node<T> node) {
        if (node != null) {
            traverseInOrder(node.leftChild);
            System.out.println(node.data + " ");
            traverseInOrder(node.rightChild);
        }
    }

    public void traversePreOrder(Node<T> node) {
        if (node != null) {
            traversePreOrder(node.leftChild);
            System.out.println(node.data + " ");
            traversePreOrder(node.rightChild);
        }
    }

    public void traversePostOrder(Node<T> node) {
        if (node != null) {
            traversePostOrder(node.leftChild);
            System.out.println(node.data + " ");
            traversePostOrder(node.rightChild);

        }
    }

    }
