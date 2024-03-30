class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarrayssWithKDistinct(nums, k) - subarrayssWithKDistinct(nums, k - 1);
    }

    private int subarrayssWithKDistinct(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        int count=0;
        int i=0;
        int j=0;
        
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            
            while(map.size()>k){
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            count+=(j-i+1);
            j++;
        }
        return count;
    }
}