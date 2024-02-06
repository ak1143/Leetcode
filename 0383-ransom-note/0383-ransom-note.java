// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
        
//         int firstsum=0,secondsum;
//         for(char ch:ransomNote)
//         {
//             firstsum+=ch-'a';
//         }
        
//         for(char ch:magazine)
//         {
//             secondsum+=ch-'a';
//         }
        
//         if(firstsum==secondsum)
//         {
//             return true;    
//         }
//         return false;
//     }
// }

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineCount = new int[26]; 

      
        for (char ch : magazine.toCharArray()) {
            magazineCount[ch - 'a']++;
        }

        // Check if ransomNote can be constructed
        for (char ch : ransomNote.toCharArray()) {
            if (magazineCount[ch - 'a'] == 0) {
                return false; 
            }
            magazineCount[ch - 'a']--;
        }

        return true;
    }
}
