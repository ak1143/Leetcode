class Solution {
    public String compressedString(String word) {
        
        int count=1;
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<word.length()-1;i++)
        {
            if(count<9)
            {
                if(word.charAt(i)==word.charAt(i+1)) count++;
                else{
                    ans.append(count);
                    ans.append(word.charAt(i));
                    count=1;
                }
            }else{
                ans.append(count);
                ans.append(word.charAt(i));
                count=1;
            }
        }
        if(count<=9){
            ans.append(count);
            ans.append(word.charAt(word.length()-1));
        }
        return ans.toString();
    }
}