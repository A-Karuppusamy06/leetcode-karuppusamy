// Last updated: 8/14/2026, 11:05:32 PM
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3        ListNode dummy = new ListNode(0); 
4        dummy.next = head;
5        ListNode prev = dummy; 
6        
7        for(int i = 0; i < left - 1; i++)
8            prev = prev.next; 
9        
10        ListNode curr = prev.next; 
11     
12        for(int i = 0; i < right - left; i++){
13            ListNode forw = curr.next; 
14            curr.next = forw.next;
15            forw.next = prev.next;
16            prev.next = forw;
17        }
18        return dummy.next;
19    }
20}