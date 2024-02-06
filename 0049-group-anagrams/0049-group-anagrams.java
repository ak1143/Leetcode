// class Solution 
// {
//     public List<List<String>> groupAnagrams(String[] strs) 
//     {
//         String []sortedstr=sorted(strs);
        
//         List<List<String>>mainlist=new ArrayList<>();
        
//         HashMap<String,Boolean> map=new HashMap<>();
        
//         for(int i=0;i<strs.length;i++)
//         {
//             if(map.get(strs[i])==false)
//             {
//                 List<String>list=new ArrayList<>();
//                 for(int j=0;j<strs.length;j++)
//                 {
//                     if(strs[i]==strs[j])
//                     {
//                         list.add(strs[j]);
//                     }
//                 }
//                 mainlist.add(list);
//             }
//             else
//             {
//                 map.put(strs[i],true);    
//             }
//         }
//         return mainlist;
//     }
    
//     String [] sorted(String[]nums)
//     {
//         String []so=new String[nums.length];
//         int i=0;
//         for(String s:nums)
//         {
//             char []sort=s.toCharArray();
//             Arrays.sort(sort);
//             so[i]=sort;
//             i++;
//         }return sorted;
//     }
// }

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> mainlist = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(s);
        }

        for (List<String> list : map.values()) {
            mainlist.add(list);
        }

        return mainlist;
    }
}
