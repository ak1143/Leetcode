class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1]){
                nums[i+1]+=1;
                count+=1;
            }else if(nums[i]>nums[i+1]){
                int ope=nums[i]-nums[i+1]+1;
                nums[i+1]+=ope;
                count+=ope;
            }
        }
        return count;
    }
}