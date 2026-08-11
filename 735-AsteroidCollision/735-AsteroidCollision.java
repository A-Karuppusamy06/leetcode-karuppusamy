// Last updated: 8/11/2026, 6:33:21 PM
import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int a : asteroids) {
            boolean alive = true;
            
            while (!stack.isEmpty() && stack.peek() > 0 && a < 0) {
                if (stack.peek() < Math.abs(a)) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == Math.abs(a)) {
                    stack.pop();
                }
                alive = false;
                break;
            }
            
            if (alive) {
                stack.push(a);
            }
        }
        
        // Convert Stack to int array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}