class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(numOnes >= k ) return k;
        else if(numOnes + numZeros >= k) return numOnes;
        int a = k - (numOnes + numZeros);
        System.out.println(a);
        System.out.println(numOnes);
        return numOnes-a;
    }
}