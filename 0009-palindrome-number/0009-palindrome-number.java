class Solution {
    public boolean isPalindrome(int x) {
        int ans=0;
        if(x<0)
            return false;
        if(x==0)
            return true;
        int val=x;
        while(val>0)
        {
            int no=val%10;
            ans=ans*10+no;
            val=val/10;
        }
        if(ans==x)
        {
            return true;
        }return false;
    }
}