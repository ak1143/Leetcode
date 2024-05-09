class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        String [] str=new String[score.length];
        
        int []arr=new int[score.length];
        
        System.arraycopy(score, 0, arr, 0, score.length);
        
        Arrays.sort(arr);
        
        for(int i=0;i<score.length;i++)
        {
            for(int j=score.length-1;j>=0;j--)
            {
                if(score[i]==arr[j]) 
                {
                    if(score.length-j>3) 
                    {
                        str[i]=Integer.toString(score.length-j);
                    }
                    else{
                        if(score.length-j==1) str[i]="Gold Medal";
                        if(score.length-j==2) str[i]="Silver Medal";
                        if(score.length-j==3) str[i]="Bronze Medal";
                    }
                }
            }
        }
        return str;
    }
}