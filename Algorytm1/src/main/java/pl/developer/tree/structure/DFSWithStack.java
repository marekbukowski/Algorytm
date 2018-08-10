package pl.developer.tree.structure;

import java.util.LinkedList;
import java.util.Stack;

public class DFSWithStack {

    private LinkedList<Integer> vertexes[];

    private int numberOfVertexes = 0;

    public DFSWithStack(int numberOfVertexes) {
        vertexes = new LinkedList[numberOfVertexes];
        this.numberOfVertexes = numberOfVertexes;
    }

    public void addEdge(int firstVertex, int secondVertex) {
        if (vertexes[firstVertex] == null) {
            vertexes[firstVertex] = new LinkedList<Integer>();
        }
        vertexes[firstVertex].add(secondVertex);
    }

    public void DFS(){

    boolean[] visited = new boolean[numberOfVertexes];

    search(0, visited);

    }

    public void search(int startIndex, boolean [] visited){
        Stack<Integer> stack = new Stack<Integer>();
        //push on stack start element

        stack.push(startIndex);

        while (!stack.isEmpty()){

           int index = stack.pop();

           if (!visited[index]){
               System.out.println("Visit " + index);
               //visit neighbour
               visited[index] = true;
           }

           if (vertexes[index]!=null){
               //for each neigbour
               for (int neghbour : vertexes[index]) {
                   if (!visited[neghbour]){
                       //push neighbour on stack
                       stack.push(neghbour);
                   }
               }
           }
        }
    }
}