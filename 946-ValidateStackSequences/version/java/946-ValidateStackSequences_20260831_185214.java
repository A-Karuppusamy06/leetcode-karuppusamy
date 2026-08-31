// Last updated: 8/31/2026, 6:52:14 PM
1class Solution {
2    public boolean validateStackSequences(int[] pushed, int[] popped) {
3        Stack<Integer> st = new Stack<>(); 
4        
5        int j = 0; 
6        
7        for(int val : pushed){
8            st.push(val); 
9             while(!st.isEmpty() && st.peek() == popped[j]){
10                st.pop(); 
11                j++; 
12            }
13        }
14        return st.isEmpty(); 
15    }
16}