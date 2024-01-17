class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        Arrays.sort(arr);
        int count=1;
        ArrayList<Integer>list=new ArrayList<>();
        
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                count++;
            }
            else{
               list.add(count);
                count=1;
            }
        }
        list.add(count);
        
        Collections.sort(list);
        
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)==list.get(i+1))
            {
                return false;
            }
        }return true;
    }
}