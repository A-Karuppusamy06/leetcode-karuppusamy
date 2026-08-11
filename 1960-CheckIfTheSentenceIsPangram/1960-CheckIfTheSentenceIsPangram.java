// Last updated: 8/11/2026, 6:31:37 PM
class Solution {
    public boolean checkIfPangram(String sentence) {

        for (char ch = 'a'; ch <= 'z'; ch++) {

            if (sentence.indexOf(ch) == -1) {
                return false;
            }

        }

        return true;
    }
}