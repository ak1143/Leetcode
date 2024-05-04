class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        for(int i=1;i<travel.length;i++)
        {
            travel[i]+=travel[i-1];
        }
        boolean g=false;
        boolean p=false;
        boolean m=false;
        int time=0;
        
        for(int i=garbage.length-1;i>=0;i--)
        {
            if(!g && garbage[i].contains("G") && i>0)
            {
                g=true;
                time+=travel[i-1];
            }
            if(!p && garbage[i].contains("P") && i>0)
            {
                p=true;
                time+=travel[i-1];
            }
            if(!m && garbage[i].contains("M") && i>0)
            {
                m=true;
                time+=travel[i-1];
            }
            time+=garbage[i].length();
        }
        return time;   
    }
}