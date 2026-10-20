class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        int curr = 0;
        int prev2 =1;
        int prev = 2;
        for(int i=3;i<=n;i++){
            curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}