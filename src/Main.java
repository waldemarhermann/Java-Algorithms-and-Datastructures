public class Main {

    public static void main(String[] args) {

        /*Stack.testAndPrint("()", true);
        Stack.testAndPrint("()()", true);
        Stack.testAndPrint("(())", true);
        Stack.testAndPrint("()()()", true);
        Stack.testAndPrint("(()())", true);
        Stack.testAndPrint(")()(", false);
        Stack.testAndPrint(")(", false);
        Stack.testAndPrint("(()", false);
        Stack.testAndPrint("))", false);
        Stack.testAndPrint("(", false);
        Stack.testAndPrint(")", false);
        Stack.testAndPrint("abc", false);*/

        Stack<Integer> unsortedStack = new Stack<>();
        unsortedStack.push(3);
        unsortedStack.push(1);
        unsortedStack.push(4);
        unsortedStack.push(2);

        System.out.println("Before sorting: ");
        unsortedStack.printStack();

        Stack.sortStack(unsortedStack);

        System.out.println("After sorting: ");
        unsortedStack.printStack();

    }
}