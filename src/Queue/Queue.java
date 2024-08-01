package Queue;

public class Queue {

    private Node first;
    private Node last;
    public int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        if (length == 0) return;
        Node temp = first;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("First value: " + first.value);
    }

    public void getLast() {
        System.out.println("Last value: " + last.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
