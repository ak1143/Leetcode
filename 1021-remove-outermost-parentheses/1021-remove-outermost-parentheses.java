
import java.util.Stack;

class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (!st.isEmpty()) {
                    ans.append(c);
                }
                st.push(c);
            } else {
                st.pop();
                if (!st.isEmpty()) {
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }
}
