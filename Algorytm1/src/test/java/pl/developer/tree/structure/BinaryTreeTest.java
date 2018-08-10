package pl.developer.tree.structure;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void shouldCreateIntegerRoot() {

        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
        binaryTree.createRoot(5);
        Assert.assertEquals(Integer.valueOf(5), binaryTree.getRootValue());
    }
    @Test
    public void shouldCreateCharacterRoot() {

        BinaryTree<Character> binaryTree = new BinaryTree<Character>();
        binaryTree.createRoot('a');
        Assert.assertEquals(Character.valueOf('a'), binaryTree.getRootValue());
    }

    @Test
    public void shoudlPrintTree(){
        BinaryTree<Character> binaryTree = new BinaryTree<Character>();
        CreateBinaryTree(binaryTree);

        binaryTree.printTree();
    }
    @Test
    public void shoouldTraverseInOrder(){

        BinaryTree<Character> binaryTree = new BinaryTree<Character>();
        shouldCreateCharacterRoot();
        CreateBinaryTree(binaryTree);

    }

    public void CreateBinaryTree(BinaryTree<Character> binaryTree) {
        binaryTree.createRoot('a');
        Node root = binaryTree.getRoot();
        Node b = root.leftChild = new Node ('b');

        Node d = b.leftChild = new Node('d');
        Node e = b.rightChild = new Node('e');

        Node f = e.leftChild = new Node('f');

        Node c = root.rightChild = new Node ('c');

        root.rightChild = new Node('c');

    }
}