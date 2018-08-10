package pl.developer.tree.structure;

public class BinarySearchTree<T extends Comparable> {

    private Node<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void createRoot(T data) {
        root = new Node<T>(data);
    }

    public Node<T> getRoot() {
        return root;
    }

    public Node<T> search(T searchdata) {
        if (root.data.equals(searchdata)) {
            return root;
        }
        Node<T> current = root;

        while (current != null) {


            if (current.data.compareTo(searchdata) == 0) {
                break;
            }
            if (current.data.compareTo(searchdata) > 0) {
                current = current.rightChild;
            }
            if (current.data.compareTo(searchdata) < 0) {
                current = current.leftChild;
            }
        }
        return null;
    }
}