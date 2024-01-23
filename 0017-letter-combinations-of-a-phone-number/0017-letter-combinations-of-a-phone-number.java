class Solution 
{
    public List<String> letterCombinations(String digits) 
    {
        if(digits.length()==0)
            return new ArrayList<>();
        String value[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String>list=pad("",digits,value);
        return list;
    }
    
    List<String> pad(String p,String up,String[]val)
    {
        if(up.isEmpty())
        {
            List<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        
        List<String>list=new ArrayList<>();
        
        int digit=up.charAt(0)-'0';
        
        for(int i=0;i<val[digit].length();i++)
        {
            char ch=val[digit].charAt(i);
            list.addAll(pad(p+ch,up.substring(1),val));
        }return list;
    }
}