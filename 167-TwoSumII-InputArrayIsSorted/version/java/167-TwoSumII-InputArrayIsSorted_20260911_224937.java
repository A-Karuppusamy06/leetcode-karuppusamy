// Last updated: 9/11/2026, 10:49:37 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3
4        int l = 0;
5        int r = numbers.length - 1;
6
7        while (l < r) {
8
9            if (numbers[l] + numbers[r] == target) {
10                return new int[] {l + 1, r + 1};
11            }
12
13            if (numbers[l] + numbers[r] > target) {
14                r--;
15            } else {
16                l++;
17            }
18        }
19
20        return null;
21    }
22}