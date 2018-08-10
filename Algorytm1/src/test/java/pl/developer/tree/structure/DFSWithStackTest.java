package pl.developer.tree.structure;

import org.junit.Test;

import static org.junit.Assert.*;

public class DFSWithStackTest {
    @Test
    public void DFS() {

        DFSWithStack dfsWithStack = new DFSWithStack(5);

        dfsWithStack.addEdge(0,1);
        dfsWithStack.addEdge(0,2);
        dfsWithStack.addEdge(0,4);
        dfsWithStack.addEdge(1,2);
        dfsWithStack.addEdge(2,0);
        dfsWithStack.addEdge(2,3);
        dfsWithStack.addEdge(3,3);
        dfsWithStack.addEdge(4,1);
        dfsWithStack.addEdge(4,2);
        dfsWithStack.DFS();

    }
}