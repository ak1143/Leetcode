class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();

        for(int i=0;i<n;i++){

            if(nums.get(i)==2){
                nums.set(i,-1);
                continue;
            }

            boolean found = false;

            for(int j=1;j<32;j++){

                if((nums.get(i) & (1<<j)) > 0 ) 
                    continue;
                
                int prev = j-1;

                int x = (nums.get(i) ^ (1<< j-1));

                nums.set(i,x);
                found = true;
                break;
            }
            if(!found){
                nums.set(i,-1);
            }
        }

        return nums.stream().mapToInt(Integer::intValue).toArray();
        
    }
}