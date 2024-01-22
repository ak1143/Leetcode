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
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                   arr[0]=nums[i];
                    break;
                }
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