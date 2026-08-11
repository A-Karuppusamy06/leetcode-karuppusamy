// Last updated: 8/11/2026, 6:35:12 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n , map.getOrDefault(n , 0 ) + 1);
        }

        List<Integer> result = new ArrayList<>();
        int limit = nums.length/3;

        for(int k : map.keySet())   if(map.get(k) > limit) result.add(k);
        
        return result;
    }
}