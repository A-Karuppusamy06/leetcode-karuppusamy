// Last updated: 8/11/2026, 6:34:17 PM
import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> numSt = new Stack<>(); 
        Stack<String> st = new Stack<>(); 
        int num = 0;
        String currentStr = ""; // Renamed from 's' to avoid variable collision

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); // Corrected variable to 'num'
            } else if (c == '[') {
                // Push the multiplier and current string context onto stacks
                numSt.push(num);
                st.push(currentStr);
                
                // Reset for the content inside the brackets
                num = 0;
                currentStr = "";
            } else if (c == ']') {
                // Retrieve the outer string context and repeat count
                String temp = st.pop();
                int repeatTimes = numSt.pop();
                
                // Append the current inner string to the outer string 'repeatTimes' times
                for (int i = 0; i < repeatTimes; i++) {
                    temp += currentStr;
                }
                currentStr = temp; // Update current string context
            } else {
                currentStr += c; // Appends standard alphabetic characters
            }
        }
        return currentStr;
    }
}