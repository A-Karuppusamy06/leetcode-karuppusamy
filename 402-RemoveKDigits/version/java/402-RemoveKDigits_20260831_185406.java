// Last updated: 8/31/2026, 6:54:06 PM
1public class Solution {
2    public String removeKdigits(String num, int k) {
3        int len = num.length();
4     
5        if(k==len)        
6            return "0";
7            
8        Stack<Character> stack = new Stack<>();
9        int i =0;
10        while(i<num.length()){
11         
12            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
13                stack.pop();
14                k--;
15            }
16            stack.push(num.charAt(i));
17            i++;
18        }
19
20        while(k>0){
21            stack.pop();
22            k--;            
23        }
24    
25        StringBuilder sb = new StringBuilder();
26        while(!stack.isEmpty())
27            sb.append(stack.pop());
28        sb.reverse();
29        
30        while(sb.length()>1 && sb.charAt(0)=='0')
31            sb.deleteCharAt(0);
32        return sb.toString();
33    }
34}