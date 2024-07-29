public class Main {

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


    public static void main(String[] args) {

    }
}