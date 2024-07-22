class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        int n=heights.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(heights[i]<heights[j]){
                    swapelements(i,j,names,heights);
                }
            }
        }

        return names;
    }
    public void swapelements(int i,int j,String[] names, int[] heights){
        int tempf=heights[i];
        heights[i]=heights[j];
        heights[j]=tempf;
        String temps=names[i];
        names[i]=names[j];
        names[j]=temps;
    }
}