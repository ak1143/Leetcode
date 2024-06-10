class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        
        int sum=0;
        int n=nums.length;
        
        map.put(sum,-1);
        
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            int rem=sum%k;
            
            if(map.containsKey(rem)){
                if(i-map.get(rem)>1){
                   return true;
                }
            } else{
                    map.put(rem,i);
                }
        }
        return false;
    }
}