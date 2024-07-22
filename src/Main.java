public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(1);

        myDLL.append(2); // 1
        myDLL.append(3); // 2
        myDLL.append(4); // 3
        myDLL.append(5); // 4

        myDLL.swapFirstLast();
        myDLL.printList();


    }
}