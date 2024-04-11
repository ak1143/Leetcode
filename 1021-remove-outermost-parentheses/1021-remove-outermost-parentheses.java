
class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (count > 0) {
                    ans.append(c);
                }
                count++;
            } else if (c == ')') {
                count--;
                if (count > 0) {
                    ans.append(c);
                }
            }
        }

        return ans.toString();
    }
}
