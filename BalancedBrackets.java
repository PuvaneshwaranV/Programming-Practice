import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push opening brackets
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }
                char openBracket = stack.pop();
                if (!isMatchingPair(openBracket, ch)) {
                    return false; // Mismatched brackets
                }
            }
        }
        
        return stack.isEmpty(); // If empty, all brackets matched
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";  // Balanced ✅
        String test2 = "{[(])}";  // Not Balanced ❌
        String test3 = "{[()}";   // Not Balanced ❌
        String test4 = "(({{[[]]}}))"; // Balanced ✅
        
        System.out.println(isBalanced(test1)); // true
        System.out.println(isBalanced(test2)); // false
        System.out.println(isBalanced(test3)); // false
        System.out.println(isBalanced(test4)); // true
    }
}
