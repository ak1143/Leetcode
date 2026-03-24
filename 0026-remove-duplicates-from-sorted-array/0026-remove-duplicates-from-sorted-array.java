class Solution {
    public int removeDuplicates(int[] nums) {
        int count =1,i=0,j=1;
        
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
                continue;
            }
            count++;
            nums[i+1] = nums[j];
            i++;
        }

        return count;
    }
}