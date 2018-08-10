package pl.developer.tree.structure;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

    private LinkedList<Integer> vertexes[];

    private int numberOfVertexes = 0;

    public DFS(int numberOfVertexes) {
        vertexes = new LinkedList[numberOfVertexes];
        this.numberOfVertexes = numberOfVertexes;
    }

    public void addEdge(int firstVertex, int secondVertex) {
        if (vertexes[firstVertex] == null) {
            vertexes[firstVertex] = new LinkedList<Integer>();
        }
        vertexes[firstVertex].add(secondVertex);
    }

    public void search(int startIndex, boolean[] visited) {
        if (!visited[startIndex]) {

            visited[startIndex] = true;
            System.out.println("Visited " + startIndex);
        }
        Iterator<Integer> neigboursIterator = vertexes[startIndex].iterator();

        while (neigboursIterator.hasNext()) {
            int neighbourIndex = neigboursIterator.next();
            if (!visited[neighbourIndex]) {
                search(neighbourIndex, visited);
            }
        }
    }
    public void DFS(){

        boolean visited[] = new boolean[numberOfVertexes];
        search(0,visited);
    }
}
