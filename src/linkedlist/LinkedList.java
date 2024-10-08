package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;


    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }


    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length ++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length ++;
    }

    public Node removeFirst() {
        if (length == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;
        length --;

        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        Node temp = head;
        if (index < 0 || index >= length) {
            return null;
        }
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        } else {
            Node newNode = new Node(value);
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            length ++;
            return true;
        }

    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        /*Node pre = head;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            pre = temp;
            temp = temp.next;
        }*/

        Node pre = get(index - 1);
        Node temp = pre.next;

        pre.next = temp.next;
        temp.next = null;
        length --;
        return temp;

    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;


        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;

        }
    }

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public void partitionList(int pivot) {
        Node smallerDummy = new Node(0);
        Node greaterDummy = new Node(0);
        Node smaller = smallerDummy;
        Node greater = greaterDummy;
        Node current = head;

        while(current != null) {
            if(current.value < pivot) {
                smaller.next = current;
                smaller = current;
            } else {
                greater.next = current;
                greater = current;
            }
            current = current.next;
        }
        smaller.next = greaterDummy.next;
        greater.next = null;
        head = smallerDummy.next;
    }

    public void removeDuplicates() {
        Node current = head;

        while(current != null && current.next != null) {
            Node runner = current;

            while(runner.next != null) {
                if(runner.next.value == current.value) {
                    runner.next = runner.next.next;
                    length--;
                    if(runner.next == null) {
                        tail = runner;
                    }
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public int binaryToDecimal() {
        Node temp = head;
        int num = 0;

        while(temp != null) {
            num = num * 2 + temp.value;
            temp = temp.next;
        }
        return num;
    }

    public void reverseBetween(int startIndex, int endIndex) {
        if (head == null) return;
        Node dummyNode= new Node(0);
        dummyNode.next = head;
        Node previousNode = dummyNode;

        for (int i = 0; i < startIndex; i++) {
            previousNode = previousNode.next;
        }

        Node currentNode = previousNode.next;

        for(int i = 0; i < endIndex - startIndex; i++) {
            Node nodeToMove = currentNode.next;
            currentNode.next = nodeToMove.next;
            nodeToMove.next = previousNode.next;
            previousNode.next = nodeToMove;
        }

        head = dummyNode.next;
    }

    public void bubbleSort() {
        if (length < 2) return;

        Node sortedUntil = null;
        while (sortedUntil != this.head.next) {
            Node current = head;
            while (current.next != sortedUntil) {
                Node nextNode = current.next;
                if (current.value > nextNode.value) {
                    int temp = current.value;
                    current.value = nextNode.value;
                    nextNode.value = temp;
                }
                current = current.next;
            }
            sortedUntil = current;
        }
    }

    public void selectionSort() {
        if (length < 2) return;
        Node current = head;
        while (current.next != null) {
            Node smallest = current;
            Node innerCurrent = current.next;
            while (innerCurrent != null) {
                if (smallest.value > innerCurrent.value) {
                    smallest = innerCurrent;
                }
                innerCurrent = innerCurrent.next;
            }
            if (smallest != current) {
                int temp = current.value;
                current.value = smallest.value;
                smallest.value = temp;
            }
            current = current.next;
        }
    }

    public void insertionSort() {
        if (length < 2) return;
        Node sortedListHead = head;
        Node unsortedListHead = head.next;
        sortedListHead.next = null;
        while (unsortedListHead != null) {
            Node current = unsortedListHead;
            unsortedListHead = unsortedListHead.next;
            if (current.value < sortedListHead.value) {
                current.next = sortedListHead;
                sortedListHead = current;
            } else {
                Node searchPointer = sortedListHead;
                while (searchPointer.next != null && current.value > searchPointer.next.value) {
                    searchPointer = searchPointer.next;
                }
                current.next = searchPointer.next;
                searchPointer.next = current;
            }
        }
        head = sortedListHead;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        tail = temp;
    }

    public void merge(LinkedList linkedList) {
        Node dummy = new Node(0);
        Node current = dummy;
        Node otherNode = linkedList.getHead();
        while (this.head != null && linkedList.getHead() != null) {
            if (this.head.value < otherNode.value) {
                current.next = this.head;
                this.head = this.head.next;
            } else {
                current.next = otherNode;
                otherNode = otherNode.next;
            }
            current = current.next;
        }
        if (this.head != null) {
            current.next = this.head;
        } else {
            current.next = otherNode;
            tail = linkedList.getTail();
        }
        head = dummy.next;
        length += linkedList.getLength();
    }

}