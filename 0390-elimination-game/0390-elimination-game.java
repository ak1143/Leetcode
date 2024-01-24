class Solution 
{
    public int lastRemaining(int n) 
    {
        boolean left=true;
        int head=1,diff=1,size=n;   
        
        while(size>1)
        {
            if(left || size % 2 == 1)
            {
                head+=diff;
            }
            diff=diff*2;
            size=size/2;
            left=!left;
        }return head;
    }
}