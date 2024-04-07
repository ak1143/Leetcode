class Solution {
    public boolean checkValidString(String s) {
        int stcount=0;
        int inclose=0;
        int endclose=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*'){
                stcount++;
            }else if(s.charAt(i)==')'){
                endclose++;
            }else if(s.charAt(i)=='('){
                inclose++;
            }
            int temp=inclose+stcount;
            if(endclose > temp)
            {
                return false;
            }
        }
         stcount=0;
         inclose=0;
         endclose=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='*'){
                stcount++;
            }else if(s.charAt(i)==')'){
                endclose++;
            }else if(s.charAt(i)=='('){
                inclose++;
            }int temp=endclose+stcount;
            if(inclose > temp)
            {
                return false;
            }
        }
        return true;
    }
}