
class Solution {
    
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 1; i <= 9; i++) {
            generateSequentialNumbers(i, low, high, result);
        }
        
        result.sort(null);
        return result;
    }

    private void generateSequentialNumbers(int current, int low, int high, List<Integer> result) {
        if (current > high) {
            return;
        }

        if (current >= low) {
            result.add(current);
        }

        int lastDigit = current % 10;

        if (lastDigit < 9) {
            generateSequentialNumbers(current * 10 + lastDigit + 1, low, high, result);
        }
    }
}





// class Solution {
//     public List<Integer> sequentialDigits(int low, int high) {
        
//        int lowdigit = first(low);
//        int highdigit = first(high); 
        
//         List<Integer> result = new ArrayList<>();
        
//         for (int i = lowdigit; i <= highdigit; i++) {
//             int no = i; 
//             int sub = i + 1;
//             while (no < high) {
//                 no = no * 10 + (sub++);
//             }
//             if (no > low && no < high) {
//                 result.add(no);
//             }
//         }
        
//         return result;
//     }
    
//     public int first(int no) {
//         while (no > 9) {
//             no = no / 10;
//         }
//         return no;
//     }
// }



// class Solution {
//     public List<Integer> sequentialDigits(int low, int high) { 
//         List<Integer>result=new Arrayist<>();
//         ans(0,low,high,result);
//         return result;
//     }
    
//     public void ans(int no,int low,int high,List<Integer>list){
//         if(no>high)
//         {
//             return;
//         }
//         if(no>low && no<high)
//         {
//             list.add(no);
//         }
//         ans(no*10+(++no),low,high,list);
//         ans((++no)*10+(++no),low,high,list);
//     }
// }