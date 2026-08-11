// Last updated: 8/11/2026, 6:34:05 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        Set <Integer> set =new HashSet<>();
        Arrays.sort(nums);
        for(int i:nums){
            set.add(i);
        }
        int n=1;
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)) li.add(i);
        }
        return li;
    }
}