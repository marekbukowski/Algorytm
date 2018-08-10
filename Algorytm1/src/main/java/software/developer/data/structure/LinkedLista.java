package software.developer.data.structure;

public class LinkedLista<T> implements List<T> {

    private Node head;


    @Override
    public void push(T data) {
        //create note
        Node newNode = new Node(data);
        //set next marker to head
        newNode.next = head;
        //set head to new node
        head = newNode;
    }
    @Override
    public void insertAfter(Node previousode, T data) {

        if (previousode==null){
            throw new RuntimeException("There is no previous node");
        }
        Node newNode = new Node(data);
        newNode.next = previousode.next;
        previousode.next = newNode;
    }

    @Override
    public void print(){
        Node currentNode = head;
        while (currentNode!=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedLista<String> list = new LinkedLista<String>();
        list.push("Kraków");
        list.push("Warszawa");
        list.push("Lublin");
        Node WarsawNode = list.head.next;
        list.insertAfter(WarsawNode, "Katowice");
        list.print();
    }

    @Override
    public void append(T data){

        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        Node last = null;
        while (currentNode!=null){
            last = currentNode;
            currentNode = currentNode.next;
        }
        last.next = newNode;
    }

    @Override
    public void delete(T key) {
        if (head == null){
            throw new RuntimeException("There is no such element");
        }
        Node previousNode = head;
        Node currentNode = head;

        while (!currentNode.data.equals(key)){
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        // in case of removing head change head
        if (currentNode == head){
            head = currentNode.next;

        }
        previousNode.next = currentNode.next;
        currentNode.next = null;
    }
}

