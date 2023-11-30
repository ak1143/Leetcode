class Solution {
    public int romanToInt(String s) {
        int i = 0;
        int num = 0;
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            char nextChar = (i < s.length() - 1) ? s.charAt(i + 1) : ' ';
            
            if (currentChar == 'M') {
                num += 1000;
            } else if (currentChar == 'D') {
                num += 500;
            } else if (currentChar == 'C') {
                if (nextChar == 'D' || nextChar == 'M') {
                    num -= 100;
                } else {
                    num += 100;
                }
            } else if (currentChar == 'L') {
                num += 50;
            } else if (currentChar == 'X') {
                if (nextChar == 'L' || nextChar == 'C') {
                    num -= 10;
                } else {
                    num += 10;
                }
            } else if (currentChar == 'V') {
                num += 5;
            } else if (currentChar == 'I') {
                if (nextChar == 'V' || nextChar == 'X') {
                    num -= 1;
                } else {
                    num += 1;
                }
            }
            
            i++;
        }
        return num;
    }
}
