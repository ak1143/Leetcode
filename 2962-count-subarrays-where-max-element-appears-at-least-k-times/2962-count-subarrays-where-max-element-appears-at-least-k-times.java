class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=0;
        int i=0;
        int j=0;
        int n=nums.length;
        long result=0;
        int count=0;
        
        for(int num:nums){
            if(num>max)
                max=num;
        }
        
        while(j<n){
            
            if(nums[j]==max){
                count++;
            }
            
            while(count>=k){
                
                result +=n-j;
                
                if(nums[i]==max)
                {
                    count--;
                }
                i++;
            }
            j++;
        }
        return result;
    }
}