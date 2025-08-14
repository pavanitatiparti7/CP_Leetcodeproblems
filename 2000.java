import java.util.*;

class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        boolean found = false;

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            stack.push(current);

            if (current == ch && !found) {
                // Reverse prefix by popping stack
                while (!stack.isEmpty()) {
                    result += stack.pop();  // concatenation
                }
                found = true;
            } else if (found) {
                result += current; // append directly
            }
        }

        // If ch was never found, return original word
        if (!found) return word;

        return result;
    }
}
