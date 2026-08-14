// Last updated: 8/14/2026, 11:11:44 PM
1class Solution {
2    public void reorderList(ListNode head) {
3        if (head == null) return;
4        ListNode slow = head, fast = head;
5        while (fast != null && fast.next != null) {
6            slow = slow.next;
7            fast = fast.next.next;
8        }
9
10        ListNode second = slow.next;
11        slow.next = null;
12        ListNode node = null;
13
14        while (second != null) {
15            ListNode temp = second.next;
16            second.next = node;
17            node = second;
18            second = temp;
19        }
20        ListNode first = head;
21        second = node;
22
23        while (second != null) {
24            ListNode temp1 = first.next, temp2 = second.next;
25            first.next = second;
26            second.next = temp1;
27            first = temp1;
28            second = temp2;
29        }        
30    }
31}