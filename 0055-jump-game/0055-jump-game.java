class Solution 
{
    public boolean canJump(int[] nums) 
    {
       int far=0;
       int curr=0;
        
        for(int i=0;i<nums.length-1;i++)
        {
            far=Math.max(far,nums[i]+i);
            
            if(i==curr)
            {
                if(curr==far && far!=nums.length-1)
                {
                    return false;
                }
                curr=far;
            }
        }return true;
    }
}