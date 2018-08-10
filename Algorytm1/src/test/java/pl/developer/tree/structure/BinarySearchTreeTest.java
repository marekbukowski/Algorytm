package pl.developer.tree.structure;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    @Test
    public void search() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>();

        Node<Integer> foundNode = binarySearchTree.search(7);

    }
    private void CreateBinaryTree(BinarySearchTree<Integer> binaryTree) {
        binaryTree.createRoot(8);
        Node root = binaryTree.getRoot();
        Node three = root.leftChild = new Node (3);
        Node ten = root.rightChild = new Node(10);

        Node one = three.leftChild = new Node(1);
        Node six = three.rightChild = new Node(6);

        Node four = six.leftChild = new Node (4);
        Node seven = six.rightChild = new Node (7);

        Node fourteen = ten.rightChild = new Node(14);
        Node thirteen = fourteen.leftChild = new Node(13);

        return;

    }
}