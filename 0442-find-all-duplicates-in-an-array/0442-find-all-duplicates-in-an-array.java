class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list= new ArrayList<>();
        
        Map<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(int num:map.keySet())
        {
            if(map.get(num)==2){
                list.add(num);
            }
        }
        return list;
    }
}