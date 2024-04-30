class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int count=0;
        
        while(i<t.length() && j<s.length())
        {
            if(s.charAt(j)==t.charAt(i))
            {
                j++;
                count++;
            }
            i++;
        }
        
        if(count==s.length()) return true;
        
        return false;
    }
}