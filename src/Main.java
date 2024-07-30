public class Main {


    public static void main(String[] args) {

        Stack.testAndPrint("()", true);
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
        Stack.testAndPrint("abc", false);

    }
}