package software.developer.data.structure;

public class Node<T> {


        // generic data in node
        T data;
        Node next;
        Node prev;

        Node(T data){
            this.data=data;
            this.next=null;

        }
    }



