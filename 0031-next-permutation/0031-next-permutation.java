


class Solution {
    public void nextPermutation(int[] nums) {
        int ind1=-1;
        int ind2=-1;
      
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
         
        if(ind1==-1){
            reverse(nums,0);
        }
        
        else{
            
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }

            swap(nums,ind1,ind2);
            reverse(nums,ind1+1);
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}

// class Solution {
//     public void nextPermutation(int[] nums) {
      
//         int ind=-1;
//         int count=0;
//         int n=nums.length-1;
        
//         for(int i=nums.length-1;i>0;i--){
//             if(nums[i]>nums[i-1]){
//                 count++;
//                ind=i-1;
//                 break;
//             }
//         }
//         if(ind==-1)
//             rev(0,n,nums);
        
// //         for(int i=nums.length-1;i>ind;i--){
            
// //             if(nums[ind]<nums[i]){
                
// //                 int temp=nums[i];
// //                 nums[i]=nums[ind];
// //                 nums[ind]=temp;
// //                 break;
// //             }
// //         }
//         for (int i = nums.length - 1; i > ind; i--) {
            
//             if (nums[i]>nums[ind]) {
//             int temp = nums[i];
//             nums[i] = nums[ind];
//              nums[ind] = temp;
//              break;
//             }
//         }

        
//         int[]arr=new int[count];
//         arr=rev(ind+1,n,nums);
//         for(int i=ind+1;i<=n;i++){
//             nums[i]=arr[i];
//         }
//     }
//     public static int[] rev(int start,int end,int[] arr){
//         while(start<=end){
//             int temp=arr[start];
//             arr[start]=arr[end];
//             arr[end]=temp;
//             start++;
//             end--;
//         }return arr;
//     }
    
// }