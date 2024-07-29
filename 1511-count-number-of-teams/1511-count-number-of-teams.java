class Solution {
    public int numTeams(int[] rating) {
        
        int n = rating.length;
        int teams = 0;

        for(int j=1;j<n-1;j++)
        {
            int smallerLeft=0;
            int largerLeft=0;
            int smallerRight=0;
            int largerRight=0;

            for(int i=0;i<j;i++)
            {
                if(rating[i]<rating[j]) smallerLeft++;
                else if(rating[i]>rating[j]) largerLeft++;
            }
            for(int k=j+1;k<n;k++){
                if(rating[j]<rating[k]) largerRight++;
                else if(rating[j]>rating[k]) smallerRight++;
            }
            teams+=(smallerLeft*largerRight)+(smallerRight*largerLeft);
        }
        return teams;
    }
}