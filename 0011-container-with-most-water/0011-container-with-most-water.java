// class Solution 
// {
//     public int maxArea(int[] height) 
//     {
//         int count=0,store=0,max=0;
        
//         for(int i=0;i<height.length;i++)
//         {
//             count=0;
//             for(int j=i+1;j<height.length;j++)
//             {
//                 store=0;
//                 if(height[i]<height[j])
//                 {
//                     store+=height[i];
//                     Math.max(max,store);
//                 }else
//                 {
//                 count++;
//                 store=count*height[j];
//                 Math.max(max,store);
//                 }
//             } 
//         }return max;
//     }
// }
// class Solution {
//     public int maxArea(int[] height) {
//         int max = 0;

//         for (int i = 0; i < height.length; i++) {
            
//             for (int j = i + 1; j < height.length; j++) {
                
//                 int h = Math.min(height[i], height[j]);
                
//                 int w = j - i;
//                 int area = h * w;
//                 max = Math.max(max, area);
//             }
//         }
//         return max;
//     }
// }
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            max = Math.max(max, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}

