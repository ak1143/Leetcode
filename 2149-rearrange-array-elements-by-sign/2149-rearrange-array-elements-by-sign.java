class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                list1.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
        }
        
        int i=0;
        int j=0;
        int [] arr=new int [nums.length];
        int k=0;
        
        while(i<list1.size() || j<list2.size())
        {
            arr[k]=list1.get(i);
            k++;
            i++;
            arr[k]=list2.get(j);
            j++;
            k++;
        }
        
        while(i<list1.size())
        {
            arr[k]=list1.get(i);
            k++;
            i++;
        }
        
        while(j<list2.size())
        {
            arr[k]=list2.get(j);
            k++;
            j++;
        }
        return arr;
    }
}