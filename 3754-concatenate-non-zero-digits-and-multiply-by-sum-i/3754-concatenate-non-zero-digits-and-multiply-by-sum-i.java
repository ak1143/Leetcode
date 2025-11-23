class Solution {
    public long sumAndMultiply(int n) {
        String str = String.valueOf(n);
        int sum = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';

            if (digit == 0) continue;

            sum += digit;
            sb.append(digit);
        }

        if (sb.length() == 0) {
            return 0; 
        }

        long num = Long.parseLong(sb.toString());
        return num * sum;
    }
}
