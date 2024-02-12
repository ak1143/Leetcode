class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        
        }int m=nums.length/2;
        for(int key:map.keySet()){
            if(map.get(key)>m)
                return key;
        }return 0;
    }
}   