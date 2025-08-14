class Solution {
    public String largestPalindromic(String num) {
        int[] freq = new int[10];
        for (char c : num.toCharArray()) freq[c - '0']++;

        Stack<Character> left = new Stack<>();
        String mid = "";

        for (int d = 9; d >= 0; d--) {
            while (freq[d] >= 2) {
                if (!(left.isEmpty() && d == 0)) left.push((char)(d + '0'));
                freq[d] -= 2;
            }
            if (mid.isEmpty() && freq[d] > 0) mid = "" + d;
        }

        if (left.isEmpty() && mid.isEmpty()) return "0";

        StringBuilder right = new StringBuilder();
        for (char c : left) right.append(c);
        right.reverse();

        StringBuilder l = new StringBuilder();
        for (char c : left) l.append(c);

        return l.toString() + mid + right.toString();
    }
}
