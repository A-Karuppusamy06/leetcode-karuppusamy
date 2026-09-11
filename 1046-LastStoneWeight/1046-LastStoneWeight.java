// Last updated: 9/11/2026, 9:23:51 AM
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            pq.offer(i);
        }
        while(pq.size() > 1){
            int i = pq.poll(); 
            int j = pq.poll();

            if(i != j){
                pq.offer(i-j);
            }
        }
        return pq.size() == 0 ? 0 : pq.poll();
    }
}