package stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> unsortedStack = new Stack<Integer>();
        unsortedStack.push(3);
        unsortedStack.push(1);
        unsortedStack.push(4);
        unsortedStack.push(2);

        System.out.println("Vor dem Sortieren: ");
        unsortedStack.printStack();

        Stack.sortStack(unsortedStack);

        System.out.println("Nach dem Sortieren: ");
        unsortedStack.printStack();
    }
}