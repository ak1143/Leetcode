class Solution {
    public int findComplement(int num) {
        // Step 1: Find the highest bit position that is set to 1
        int mask = 1;
        while(mask < num) {
            mask = (mask << 1) | 1;
        }
        
        // Step 2: XOR the number with the mask to flip all bits
        return num ^ mask;
    }
}
