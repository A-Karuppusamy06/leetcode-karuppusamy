// Last updated: 9/11/2026, 9:24:05 AM
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;

        if (n == 1) return 1;

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < n; i++) {

            if (i >= 2 &&
                ((arr[i] > arr[i - 1] && arr[i - 1] < arr[i - 2]) ||
                 (arr[i] < arr[i - 1] && arr[i - 1] > arr[i - 2]))) {

                currLen++;
            }
            else if (arr[i] != arr[i - 1]) {
                currLen = 2;
            }
            else {
                currLen = 1;
            }

            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}