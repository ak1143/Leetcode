class Solution 
{
    public int[] findErrorNums(int[] nums) 
    {
        int n=nums.length;
        int sum=0,sum1=0;
        
        int []arr=new int[2];
        
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        
        //  first way:- time complexity-o(n^2);       `
        // for(int i=0;i<n-1;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //            arr[0]=nums[i];
        //             break;
        //         }
        //     }
        // }
        
        // second way:-
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                arr[0]=nums[i];
                break;
            }else{
                map.put(nums[i],1);
            }
        }
        
        
        for(int i=0;i<n;i++)
        {
            sum1+=nums[i];
        }
        arr[1]=sum-sum1+arr[0];
        
        return arr;
    }
}