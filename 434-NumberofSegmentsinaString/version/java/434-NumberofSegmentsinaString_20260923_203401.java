// Last updated: 9/23/2026, 8:34:01 PM
1import java.util.*;
2class Solution {
3    public int countSegments(String s) {
4        StringTokenizer st = new StringTokenizer(s," ");
5        int c =0;
6        while(st.hasMoreTokens())
7        {
8            c++;
9            st.nextToken();
10        }
11        
12        return c;
13    }
14}