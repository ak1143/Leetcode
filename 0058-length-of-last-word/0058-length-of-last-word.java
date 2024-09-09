class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int last=s.length()-1;
        while(last>=0 && s.charAt(last)==' ')
        {
            last--;
        }
        while(last>=0 && s.charAt(last)!=' ')
        {
            count++;
            last--;
        }
        return count;
}
}