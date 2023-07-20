package stack;

public class Main {

    public static Boolean isBalancedParentheses(String string) {
        Stack<Character> stack = new Stack<>();

        for (char p : string.toCharArray()) {
            if (String.valueOf(p).contains("(")) {
                stack.push(p);
            } else if (String.valueOf(p).contains(")")) {
                if (stack.isEmpty() || stack.pop() != '(')
                    return false;
            }
        }
        return stack.isEmpty();
    }


    public static String reverseString(String string) {
        Stack<Character> stack = new Stack<>();
        String reversedString = "";

        for (char c : string.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            reversedString += stack.pop();
        }
        return reversedString;
    }


    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

    }
}
