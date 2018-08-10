package software.developer.data.structure;

public class DoubleLinkList<T> implements List<T> {

    private Node head;



    @Override
    public void push(T data) {
        Node newNode = new Node(data);

        newNode.next = head;

        if(head != null){
            head.prev = newNode;
        }
        head = newNode;}


    public void printReverse(){
        Node currentNode = head;
        //find last element
        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }
        while (currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.prev;
        }
    }

    @Override
    public void insertAfter(Node previousode, T data) {
        if (previousode == null){
            throw new RuntimeException("Previous node shouldn't be empty");
        }
        Node newNode = new Node(data);

        Node nextNode = previousode.next;

        newNode.next = nextNode;
        newNode.prev = previousode;
        nextNode.prev = newNode;
        previousode.next = nextNode;



    }

    @Override
    public void print() {
        Node currentNode = head;
        while (currentNode!=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

    }

    @Override
    public void append(T data) {
        Node newNode = new Node(data);

                if (head == null){
            head = newNode;
            return;
                }
                Node currentNode = head;
                //find last element
                while (currentNode.next != null){
                    currentNode = currentNode.next;
                }
                newNode.prev = currentNode;
                currentNode.next = newNode;

    }

    @Override
    public void delete(T key) {

        if (head == null){
            throw new RuntimeException("List is empty");
        }
        Node currentNode = head;
        Node previousNode = head;

        while (currentNode.next != null){

            if(currentNode.data.equals(key)){
                Node nextNode = currentNode.next;
                //there is one element after
                if(currentNode.next!=null) {
                    nextNode.prev = previousNode;
                }
                if (previousNode!=null){
                    previousNode.next=nextNode;
                }

                if (currentNode == head) {
                    head = nextNode;
                }

                return;
            }
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        DoubleLinkList<String> list = new DoubleLinkList<String>();
        list.push("Warsaw");
        list.push("Katowice");
        list.push("Lublin");
        list.push("Rzeszów");
        list.print();

        Node warsawNode = list.head.next;
        list.insertAfter(warsawNode, "Katowice ");

        //normal order
        list.print();

    }
}
