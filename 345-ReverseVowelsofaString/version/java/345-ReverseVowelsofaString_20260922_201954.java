// Last updated: 9/22/2026, 8:19:54 PM
1class Solution {
2    public String reverseVowels(String s) {
3        char[]arr=s.toCharArray();
4        int left=0,right=arr.length-1;
5        while(left<right){
6            while(left<right && !isVowel(arr[left])){
7                left++;
8            }
9            while(left<right && !isVowel(arr[right])){
10                right--;
11            }
12            char temp=arr[left];
13            arr[left]=arr[right];
14            arr[right]=temp;
15            left++;
16            right--;
17        }
18        return new String(arr);
19    }
20    private boolean isVowel(char ch){
21        ch=Character.toLowerCase(ch);
22           return ch == 'a' || ch == 'e' || ch == 'i' ||
23               ch == 'o' || ch == 'u';        
24    }
25}