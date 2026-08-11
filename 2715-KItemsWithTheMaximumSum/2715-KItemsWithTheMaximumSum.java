// Last updated: 8/11/2026, 6:30:56 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        // First take as many 1's as possible
        int takeOnes = Math.min(numOnes, k);
        k -= takeOnes;
        
        // Then take zeros (they don't change sum)
        int takeZeros = Math.min(numZeros, k);
        k -= takeZeros;
        
        // If still need more, take -1's
        int takeNegOnes = k; // whatever is left
        return takeOnes - takeNegOnes;
    }
}
