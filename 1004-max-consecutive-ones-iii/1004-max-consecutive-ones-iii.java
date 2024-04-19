class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int res=0;
        
        while(i<nums.length)
        {
            int j=i;
            int onec=0;
            int most=0;
            
            while(j<nums.length)
            {
                if(nums[j]==1){
                    onec++;
                }else if(nums[j]==0 && most<k){
                    most++;
                    onec++;
                }else{
                    break;
                }
                j++;
            }
            res=Math.max(res,onec);
            i++;
        }
        return res;
    }
}