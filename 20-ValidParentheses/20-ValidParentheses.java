// Last updated: 8/11/2026, 6:38:27 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                st.push(c);
            else {
                if (st.isEmpty()) return false;

                char ch = st.pop();

                if ((c == ')' && ch != '(') ||
                    (c == '}' && ch != '{') ||
                    (c == ']' && ch != '['))
                    return false;
            }
        }

        return st.isEmpty();
    }
}