class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = nums1.length;
        int m = nums2.length;


        for(int num: nums1){
            map.put(num,map.getOrDefault(num,0)+m);
        }

        for(int num : nums2){
            map.put(num,map.getOrDefault(num,0)+n);
        }

        int result = 0;
        
        for(Map.Entry<Integer,Integer> set : map.entrySet()){
            if(set.getValue() % 2 != 0) result = result ^ set.getKey();
        }

        return result;


    }
}