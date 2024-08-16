class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int n = arrays.size();
        
        // Initialize the minimum and maximum values from the first array
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);
        
        int maxDiff = 0;
        
        // Iterate through the rest of the arrays
        for (int i = 1; i < n; i++) {
            List<Integer> currentArray = arrays.get(i);
            int currentMin = currentArray.get(0);
            int currentMax = currentArray.get(currentArray.size() - 1);
            
            // Calculate the possible maximum difference
            maxDiff = Math.max(maxDiff, Math.abs(currentMax - minVal));
            maxDiff = Math.max(maxDiff, Math.abs(maxVal - currentMin));
            
            // Update the global minimum and maximum values
            minVal = Math.min(minVal, currentMin);
            maxVal = Math.max(maxVal, currentMax);
        }
        
        return maxDiff;
    }
}
