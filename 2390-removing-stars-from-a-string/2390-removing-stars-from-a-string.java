class Solution {
    public String removeStars(String s) {
        
        Stack <Character>st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='*')
            {
                st.push(s.charAt(i));
            }else{
                st.pop();
            }
        }
        
        Iterator value = st.iterator(); 
        String str="";
        
        while(value.hasNext()){
            str+=value.next();
        }
        return str;
    }
}