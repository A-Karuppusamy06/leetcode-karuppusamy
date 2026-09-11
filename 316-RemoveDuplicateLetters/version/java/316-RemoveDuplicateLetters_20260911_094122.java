// Last updated: 9/11/2026, 9:41:22 AM
1class Solution {
2    public String removeDuplicateLetters(String s) {
3        int[] lastIndex = new int[26];
4
5        for(int i=0; i<s.length(); i++){
6            lastIndex[s.charAt(i)-'a'] = i; 
7        }
8
9        boolean[] visited = new boolean[26];
10
11        Stack<Integer> stack = new Stack<>();
12
13        for(int i=0; i<s.length(); i++){
14            int c = s.charAt(i)-'a';
15            if(visited[c]) continue;
16
17            visited[c] = true;
18
19            while(!stack.isEmpty() && stack.peek() > c && lastIndex[stack.peek()] > i){
20                visited[stack.pop()] = false;
21            }
22            stack.push(c);
23        }
24        StringBuilder res = new StringBuilder();
25
26        for(int l : stack){
27            res.append((char)(l+'a'));
28        }
29        return res.toString();
30    }
31}