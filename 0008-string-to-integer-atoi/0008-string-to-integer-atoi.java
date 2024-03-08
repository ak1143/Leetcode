class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int sign = 1;
        int i = 0;
        long result = 0;

        // Skip leading whitespace
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Check for optional sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert digits to integer
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // Check for overflow
            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * result);
    }
}
