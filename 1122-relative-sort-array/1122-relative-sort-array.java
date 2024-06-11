class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        boolean[] arr=new boolean[arr1.length];
        int[] Arr=new int[arr1.length];
        
        int k=0;
        
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if (arr2[i]==arr1[j]){
                    Arr[k]=arr1[j];
                    k++;
                    arr[j]=true;
                }
            }
        }
        int[]arr3=new int[arr1.length-k];
        int j=0;
         
        for(int i=0;i<arr1.length;i++){
            if(arr[i]==false){
                arr3[j]=arr1[i];
                j++;
            }
        }
        Arrays.sort(arr3);
        
        for(j=0;j<arr3.length;j++){
            Arr[k]=arr3[j];
            k++;
        }
        return Arr;
    }
}