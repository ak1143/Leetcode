class Solution {
    public List<List<Integer>> combinationSum2(int[] candidate, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidate);
        findCombinations(candidate, target, 0, new ArrayList<>(), list);
        return list;
    }

    private void findCombinations(int[] candidate, int target, int start, List<Integer> currentList, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = start; i < candidate.length; i++) {
            if (i > start && candidate[i] == candidate[i - 1]) {
                continue; 
            }

            if (candidate[i] <= target) {
                currentList.add(candidate[i]);
                findCombinations(candidate, target - candidate[i], i + 1, currentList, result);
                currentList.remove(currentList.size() - 1);
            } else {
                break; 
            }
        }
    }
}




// class Solution 
// {
//     public List<List<Integer>> combinationSum2(int[] candidate, int target) 
//     {
//        List<List<Integer>>list=new ArrayList<>();
        
//         int i=0,left=0,right=0;
//         while(i!=candidate.length)
//         {
//             if(candidate[i]>target)
//             {
//                 i++;
//             }
//             else if(candidate[i]==target)
//             {
//                 list.add(new ArrayList<>(Arrays.asList(candidate[i])));
//             }
//             left=i+1;
//             right=candidate.length-1;
            
//             while(left<right)
//             {
//                 if(candidate[i]+candidate[left]<target)
//                 {
//                     if(candidate[i]+candidate[left]+candidate[right]==target)
//                     {
//                         list.add(new ArrayList<>(Arrays.asList(candidate[i],candidate[left],candidate[right])));
//                          left++;
//                          right=candidate.length-1;
//                     }
//                     else if(candidate[i]+candidate[left]+candidate[right]>target)
//                     {
//                         right--;
//                     }
//                 }
//                 else if(candidate[i]+candidate[left]>target)
//                 {
//                     left++;
//                 }else   
//                 {
//                     list.add(new ArrayList<>(Arrays.asList(candidate[i],candidate[left])));
//                     left++;
//                     right=candidate.length-1;
//                 }
//             }i++;
//         }return list;
//     }
// }