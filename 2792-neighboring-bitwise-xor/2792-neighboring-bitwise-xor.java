class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int result = 0;
        for(int num : derived)
        {
            result = result ^ num; 
        }

        if(result == 0) return true;

        return false;
    }
}