package Queue;

public class Main {

    public static void main(String [] args) {
        MyQueue q = new MyQueue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Front: " + q.peek());

        System.out.println("Is empty? " + q.isEmpty());

    }

}
