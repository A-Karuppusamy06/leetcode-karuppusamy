// Last updated: 9/11/2026, 9:21:55 AM


class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;

        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        int count = 0;

        for (int freq : map.values()) {
            if (freq == maxFreq) {
                count += freq;
            }
        }

        return count;
    }
}