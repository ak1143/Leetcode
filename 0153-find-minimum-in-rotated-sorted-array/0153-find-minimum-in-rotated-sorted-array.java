class Solution {
    public int findMin(int[] nums) {
       int min=Integer.MAX_VALUE;
       int s=0;
       int e=nums.length-1; 
       while(s<=e)
       {
           int mid=(s+e)/2;
           if(nums[mid]<nums[e]){
               min=Math.min(min,nums[mid]);
               e=mid-1;
           }else{
               min=Math.min(min,nums[e]);
               s=mid+1;
           }
       }
        return min;
    }
}