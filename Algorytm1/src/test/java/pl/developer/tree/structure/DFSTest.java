package pl.developer.tree.structure;

import org.junit.Test;

import static org.junit.Assert.*;

public class DFSTest {
    @Test
    public void DFS() {

        DFS dfs = new DFS(5);

        dfs.addEdge(0,1);
        dfs.addEdge(0,2);
        dfs.addEdge(0,4);
        dfs.addEdge(1,2);
        dfs.addEdge(2,0);
        dfs.addEdge(2,3);
        dfs.addEdge(3,3);
        dfs.addEdge(4,1);
        dfs.addEdge(4,2);
        dfs.DFS();

    }

}