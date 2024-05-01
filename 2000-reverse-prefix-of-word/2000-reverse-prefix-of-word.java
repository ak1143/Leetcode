class Solution {
    public String reversePrefix(String word, char ch) 
    {
        int ans = isCharacter(word,ch);
        if(ans == -1) return word;
        
        StringBuilder str=new StringBuilder();
        
        for(int i=ans;i>=0;i--)
        {
            str.append(word.charAt(i));
        }
        
        for(int i=ans+1;i<word.length();i++)
        {
            str.append(word.charAt(i));
        }
        
        return str.toString();
    }
    public int isCharacter(String s,char ch)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                return i;
            }
        }
        return -1;
    }
}