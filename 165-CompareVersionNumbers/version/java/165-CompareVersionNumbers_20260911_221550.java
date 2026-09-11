// Last updated: 9/11/2026, 10:15:50 PM
1public class Solution {
2public int compareVersion(String version1, String version2) {
3    int temp1 = 0,temp2 = 0;
4    int len1 = version1.length(),len2 = version2.length();
5    int i = 0,j = 0;
6    while(i<len1 || j<len2) {
7        temp1 = 0;
8        temp2 = 0;
9        while(i<len1 && version1.charAt(i) != '.') {
10            temp1 = temp1*10 + version1.charAt(i++)-'0';
11            
12        }
13        while(j<len2 && version2.charAt(j) != '.') {
14            temp2 = temp2*10 + version2.charAt(j++)-'0';
15            
16        }
17        if(temp1>temp2) return 1;
18        else if(temp1<temp2) return -1;
19        else {
20            i++;
21            j++;
22            
23        }
24        
25    }
26    return 0;
27    
28}
29}