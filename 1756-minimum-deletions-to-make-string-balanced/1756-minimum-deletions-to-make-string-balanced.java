class Solution {
    public int minimumDeletions(String s) {
        int count=0;
       Stack<Character>st = new Stack<>();
       for(int i=0;i<s.length();i++)
       {
            if(!st.isEmpty() && st.peek()=='b' && s.charAt(i)=='a'){
                st.pop();
                count++;
            }else st.push(s.charAt(i));
       } 
       return count;
    }
}