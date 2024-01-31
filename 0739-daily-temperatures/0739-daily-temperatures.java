class Solution 
{
    
    public int[] dailyTemperatures(int[] temp) 
    {
//         optimal approach by using stack because it follows the ine way ordering like decresing order.
        
        int n=temp.length;
        int [] arr =new int [n];        
        
        Stack<Integer> st=new Stack <> ();
        
        for(int i=n-1;i>=0;i--)
        {
            while(!st.empty() && temp[i]>=temp[st.peek()])
            {
                st.pop();
            }
            if(st.empty())
            {
                arr[i]=0;
            }else{
                arr[i]=st.peek()-i;
            }
            st.push(i);
        }
        return arr;
        
        
        //     brute force approach
        
        
//         int []arr=new int[temp.length];
    
//         for(int i=0;i<temp.length-1;i++)
//         {
//             int ind=0;
//             for(int j=i+1;j<temp.length;j++)
//             {
//                 if(temp[i]<temp[j])
//                 {
//                     ind=j;
//                     break;
//                 }
//             }
//             if(ind!=0)
//             {
//                 arr[i]=ind-i;
//             }else{
//                 arr[i]=0;
//             }
//         }
//           arr[temp.length-1]=0;
//         return arr;
    }
}