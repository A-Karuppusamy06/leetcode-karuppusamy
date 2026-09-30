// Last updated: 9/30/2026, 10:21:44 AM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> set = new HashSet<>();
4        int ans[] = new int[nums1.length];
5        int a = 0;
6        for(int val:nums1){
7            set.add(val);
8        }
9        for(int val:nums2){
10            if(set.contains(val)){
11                ans[a] = val;
12                a++;
13                set.remove(val);
14            }
15        }
16        return Arrays.copyOf(ans,a);
17    }
18}