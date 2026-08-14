// Last updated: 8/14/2026, 11:08:59 PM
1class Solution {
2    public ListNode partition(ListNode head, int x) {
3        ListNode left = new ListNode(0);
4        ListNode right = new ListNode(0);
5        
6        ListNode leftTail = left;
7        ListNode rightTail = right;
8        
9        while(head != null){
10            if(head.val < x){
11                leftTail.next = head;
12                leftTail = leftTail.next;
13            }
14            else{
15                rightTail.next = head;
16                rightTail = rightTail.next;
17            }
18            head = head.next;
19        }
20        
21        leftTail.next = right.next;
22        rightTail.next = null;
23        
24        return left.next;
25    }
26}