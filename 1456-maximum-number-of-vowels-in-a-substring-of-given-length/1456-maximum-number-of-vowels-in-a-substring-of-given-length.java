class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character>set=new HashSet<>();
        int count=0;
        int newcount=0;
        
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))){
                count++;
            }
        }
        
        int i=k;
        int j=0;
        newcount=count;
        while(i<s.length()){
            if(set.contains(s.charAt(j)) && !set.contains(s.charAt(i)))
            {
                newcount--;
            }
            else if(!set.contains(s.charAt(j)) && set.contains(s.charAt(i))){
                newcount++;
            }
            count=Math.max(count,newcount);
            i++;
            j++;
        }
        return count;
    }
}