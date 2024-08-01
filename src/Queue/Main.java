package Queue;

public class Main {

    public static void main(String [] args) {
        Queue queue = new Queue(5);

        queue.printQueue();
        queue.getFirst();
        queue.getLast();
        queue.getLength();
    }

}
