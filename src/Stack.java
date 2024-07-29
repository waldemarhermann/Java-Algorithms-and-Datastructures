import java.util.ArrayList;

public class Stack <T> {

    ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size() - 1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int getSize() {
        return stackList.size();
    }

    public void push(T item) {
        stackList.add(item);
    }

    public T pop() {
        if (isEmpty()) return null;
        return stackList.remove(stackList.size() - 1);
    }

    public static String reverseString(String string) {
        Stack<Character> myStack = new Stack<>();
        String newString = "";

        char[] charArray = string.toCharArray();

        for (char c : charArray) {
            myStack.push(c);
        }

        while(!myStack.isEmpty()) {
            newString += myStack.pop();
        }

        return newString;
    }

}
