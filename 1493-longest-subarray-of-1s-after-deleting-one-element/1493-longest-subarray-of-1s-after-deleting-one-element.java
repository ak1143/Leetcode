    class Solution {
        public int longestSubarray(int[] nums) {
            int count=0;
            int zero=0;
            int countspl=0;
            
            for(int i=0;i<nums.length;i++)
            {
                int res=0;
                if(nums[i]==0)
                {
                    zero++;
                    int one=0;
                    for(int j=0;j<nums.length;j++)
                    {
                        if(j==i) continue;
                        if(nums[j]==1)
                        {
                            one++;
                            countspl++;
                            res=Math.max(res,one);
                        }else{
                            one=0;
                        }
                    }
                    if(countspl==0) return 0;
                }
                count=Math.max(res,count);
            }
            if(zero==0) return nums.length-1;
            
            return count;
        }
    }
