// Last updated: 9/11/2026, 9:23:02 AM
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