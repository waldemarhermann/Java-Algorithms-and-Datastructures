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

        /* Alternativ:
        while (!myStack.isEmpty()) {
            newString.append(myStack.pop());
        }
         */

        while(!myStack.isEmpty()) {
            newString += myStack.pop();
        }



        return newString;
    }

    public static boolean isBalancedParentheses(String parenthese) {
        Stack<Character> stack = new Stack<>();

        char[] parentheseArray = parenthese.toCharArray();
        for (char p : parentheseArray) {
            if (p == '(') {
                stack.push(p);
            } else if (p == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void testAndPrint(String testString, boolean expected) {
        boolean result = isBalancedParentheses(testString);

        System.out.println("Test String: " + testString);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);

        if (expected == result) {
            System.out.println("Status: PASS");
        } else {
            System.out.println("Status: FAIL");
        }

        System.out.println("--------------");
    }

}
