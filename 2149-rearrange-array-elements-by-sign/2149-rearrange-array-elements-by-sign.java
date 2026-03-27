class Solution {
    public int[] rearrangeArray(int[] nums) {

        // // even -> positive
        // // old -> neg

        // int i=0,j=0;

        // while(i<n){
        //     if(nums[i]>0) break;
        //     i++;
        // }

        // while(j<n){
        //     if(nums[j]<0) break;
        //     j++;
        // }

        // while(j<nums.length){
        
        //     if(i==0) continue;

        //     swap(i,j);

        // }

        int n = nums.length;
        int k=0,l=0;
        int [] arr1 = new int[n/2];

        int [] arr2 = new int[n/2];

        for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr1[k] = nums[i];
                k++; 
            }else{
                arr2[l]= nums[i];
                l++;
            }
        }
        k=0;
        l=0;

        for(int i=0;i<n;i+=2){
            nums[i] = arr2[l++];
            nums[i+1] = arr1[k++];
        }

        return nums;


    }
}