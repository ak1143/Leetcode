class Solution {
    public int maxDepth(String s) {
        if(s.length()==0 )
            return 0;
        if(s.length()==1){
            if(s.charAt(0)=='(' || s.charAt(0)== ')')
                return 0;
        }
        
        int count=0;
        int result=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== '(' ){
                count++;
                result=Math.max(count,result);
            }else if(s.charAt(i)==')'){
                count--;
                result=Math.max(count,result);
            }
        }
        return result;
        
    }
}