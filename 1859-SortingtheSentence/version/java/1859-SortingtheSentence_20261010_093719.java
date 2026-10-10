// Last updated: 10/10/2026, 9:37:19 AM
1class Solution {
2    public String sortSentence(String s) {
3        s+=" ";
4        int n = s.length();
5        int c=0;
6        for(int i=0;i<n;i++)
7            {
8                if(s.charAt(i)==' ')c++;
9            }
10        String arr[] = new String[c];
11        String str = "";
12        int idx = 1;
13        for(int i=0;i<n;i++)
14            {
15                char ch = s.charAt(i);
16                if(ch > 48 && ch <= 57)
17                {
18                    idx = ch - '0';
19                }
20                else if(ch != ' ')
21                {
22                    str+=ch;
23                }
24                else
25                {
26                    arr[idx-1]=str;
27                    str="";
28                }
29            }
30        String res = "";
31        for(String t : arr)
32            {
33                res+=t;
34                res+=" ";
35            }
36        return res.trim();
37    }
38}