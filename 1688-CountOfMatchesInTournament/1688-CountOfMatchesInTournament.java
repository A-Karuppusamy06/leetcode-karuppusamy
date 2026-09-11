// Last updated: 9/11/2026, 9:23:10 AM
class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                matches += n / 2;
                n = n / 2;
            } else {
                matches += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return matches;
    }
}