package heap;

public class Main {

    public static void main(String[] args) {

        Heap myHeap = new Heap();

        myHeap.insert(99);
        myHeap.insert(77);
        myHeap.insert(55);
        myHeap.insert(33);
        System.out.println(myHeap.getHeap());

        myHeap.insert(100);
        System.out.println(myHeap.getHeap());

        myHeap.insert(75);
        System.out.println(myHeap.getHeap());

        myHeap.insert(80);
        System.out.println(myHeap.getHeap());

    }
}
