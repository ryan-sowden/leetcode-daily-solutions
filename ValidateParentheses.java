import java.util.Stack;

public class ValidateParentheses {
    public static void main(String[] args) {
        /*
        You are given a string s consisting of the following characters:
        '(', ')', '{', '}', '[' and ']'.

        The input string s is valid if and only if:

        1. Every open bracket is closed by the same type of close bracket.
        2. Open brackets are closed in the correct order.
        3. Every close bracket has a corresponding open bracket of the same type.

        Return true if s is a valid string, and false otherwise.

        Example 1:
        Input: s = "[]"
        Output: true

        Example 2:
        Input: s = "[(])"
        Output: false
         */

        String str1 = "[]";
        String str2 = "[(])";

        Stack<Character> stack = new Stack<>();
        java.util.Map<Character, Character> closeToOpen = new java.util.HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char c : str1.toCharArray()) {
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                } else {
                    System.out.println("False");;
                }
            } else {
                stack.push(c);
            }
        }
        System.out.println(stack.isEmpty());
    }
}
