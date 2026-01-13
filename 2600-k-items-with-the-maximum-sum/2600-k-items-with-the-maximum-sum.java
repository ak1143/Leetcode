class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        return (numOnes >= k) ? k : (numOnes + numZeros >= k ? numOnes : numOnes- (k - (numOnes + numZeros)));
    }
}