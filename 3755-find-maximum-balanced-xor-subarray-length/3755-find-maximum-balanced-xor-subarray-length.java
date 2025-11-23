class Solution {
    public int maxBalancedSubarray(int[] nums) {
        int result =0;
        int diff = 0;
        int prefixXor=0;
        HashMap<String,Integer> map = new HashMap<>();

        map.put("0#0",-1);

        for(int i=0;i<nums.length;i++){

            if(nums[i]%2==0) diff++;
            else diff--;
            
            prefixXor ^= nums[i];

            String str = String.valueOf(diff) +"#"+String.valueOf(prefixXor);

            if(map.containsKey(str)){
                int value = map.get(str);
                result = Math.max(i-value,result);
            }else{
                map.put(str,i);
            }
        
        }
        return result;
    }
}