// Last updated: 8/11/2026, 2:34:24 PM
1class Solution {
2     public List<List<Integer>> findWinners(int[][] matches){
3        Map<Integer, Integer> losses = new TreeMap<>();
4        for(int[] m : matches){
5            losses.put(m[0], losses.getOrDefault(m[0], 0));
6            losses.put(m[1], losses.getOrDefault(m[1], 0) + 1);
7        }
8        List<List<Integer>> r = Arrays.asList(new ArrayList<>(), new ArrayList<>());
9        for(Integer player : losses.keySet())
10            if(losses.get(player) <= 1)
11                r.get(losses.get(player)).add(player);
12        return r;
13    }
14}