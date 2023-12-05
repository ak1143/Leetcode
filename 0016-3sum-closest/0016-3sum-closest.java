class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int clsum=nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length-2;i++){
            int start=i+1;
            int end=nums.length-1;

            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if(Math.abs(target-sum)<Math.abs(target-clsum)){
                    clsum=sum;
                }
                if(sum>target){
                    end--;
                }else{
                    start++;
                }
            }
        }return clsum;
    }
}