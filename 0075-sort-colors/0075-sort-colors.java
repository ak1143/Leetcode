class Solution {
    public void sortColors(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            boolean swaped=false;
            for(int j=i+1;j<arr.length;j++)
            {
                
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    // swaped=true;
                }
            }
            // if(!swaped)
            // {
            //     break;
            // }
        }
    }
}