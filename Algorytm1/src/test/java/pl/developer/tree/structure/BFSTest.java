package pl.developer.tree.structure;

import org.junit.Test;

import static org.junit.Assert.*;

public class BFSTest {
    @Test
    public void bfs() {

        BFS bfs = new BFS(6);
        bfs.addEdge(0,1);
        bfs.addEdge(0,2);
        bfs.addEdge(1,3);
        bfs.addEdge(1,4);
        bfs.addEdge(2,4);
        bfs.addEdge(3,5);
        bfs.addEdge(3,4);
        bfs.addEdge(4,5);
        bfs.bfs();
    }
}