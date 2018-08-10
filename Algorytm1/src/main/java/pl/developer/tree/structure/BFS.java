package pl.developer.tree.structure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    private LinkedList<Integer> vertexes[];

    private int numberOfVertexes = 0;

    public BFS(int numberOfVertexes) {
        vertexes = new LinkedList[numberOfVertexes];
        this.numberOfVertexes = numberOfVertexes;

    }

    public void addEdge(int firstVertex, int secondVertex) {
        //in case the array list is empty
        if (vertexes[firstVertex] == null) {
            vertexes[firstVertex] = new LinkedList<Integer>();
        }
        vertexes[firstVertex].add(secondVertex);
    }

    public void bfs() {
        boolean[] visited = new boolean[numberOfVertexes];
        int startIndex = 0;
        search(0, visited);
    }


    public void search(int startIndex, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        visited[startIndex] = true;
        queue.add(startIndex);

        while (!queue.isEmpty()) {
            int index = queue.poll();
                System.out.println("index " + (index + 1));

                if (vertexes[index] != null) {
                    Iterator<Integer> neighboursIterator = vertexes[index].iterator();

                    while (neighboursIterator.hasNext()) {
                        int neighbourIndex = neighboursIterator.next();

                        if (!visited[neighbourIndex]) {
                            visited[neighbourIndex] = true;
                            queue.add(neighbourIndex);

                        }

                    }
                }


        }

    }
}