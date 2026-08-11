// Last updated: 8/11/2026, 6:32:24 PM
class Solution {
    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            while(stack.peek() <= arr[i]) {
                res += stack.pop() * Math.min(arr[i], stack.peek());
            }
            stack.push(arr[i]);
        }
        while(stack.size() > 2) {
            res += stack.pop() * stack.peek();
        }
        return res;
    }
}