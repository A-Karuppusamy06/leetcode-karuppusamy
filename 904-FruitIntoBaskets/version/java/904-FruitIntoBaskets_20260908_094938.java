// Last updated: 9/8/2026, 9:49:38 AM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5        int low = 0;
6        int ans = 0;
7
8        for (int high = 0; high < fruits.length; high++) {
9
10            map.put(fruits[high], map.getOrDefault(fruits[high], 0) + 1);
11
12            while (map.size() > 2) {
13                map.put(fruits[low], map.get(fruits[low]) - 1);
14
15                if (map.get(fruits[low]) == 0) {
16                    map.remove(fruits[low]);
17                }
18
19                low++;
20            }
21
22            ans = Math.max(ans, high - low + 1);
23        }
24
25        return ans;
26    }
27}