class Solution {
    public String firstPalindrome(String[] words) 
    {
        for(int i=0;i<words.length;i++)
        {
            if(palindromic(words[i]))
            {
                return words[i];
            }
        }
        return "";
    }
    
    boolean palindromic(String s){
        
        int start=0;
        int end=s.length()-1;
        
        while(start<end){
            
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}