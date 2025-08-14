import java.util.*;

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!stack.isEmpty()) {
                    stack.pop(); // remove previous character
                }
            } else {
                stack.push(c); // keep normal character
            }
        }

        // Convert stack to string
        String result = "";
        for (char c : stack) {
            result += c; // concatenation
        }

        return result;
    }
}
