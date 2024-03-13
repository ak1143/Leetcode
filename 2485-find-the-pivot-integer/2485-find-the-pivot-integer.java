class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int sum=0;
        int result=n;
        int no=n;
        
        for(int i=1;i<=n;i++){
            sum+=i;
        }

        while(sum!=1){
            if(sum==result){
                return no;
            }
            sum-=no;
            no=no-1;
            result+=no;
        }
        return -1;
    }
}