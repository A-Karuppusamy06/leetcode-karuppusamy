// Last updated: 8/14/2026, 11:10:26 PM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        if (head == null || head.next == null)
4            return head;
5        ListNode fake = new ListNode(0);
6        fake.next = head;
7        ListNode curr = fake;
8       
9        while(curr.next != null && curr.next.next != null){      
10            if(curr.next.val == curr.next.next.val) {
11                int duplicate = curr.next.val;
12               
13                while(curr.next !=null && curr.next.val == duplicate) {
14                   
15                    curr.next = curr.next.next;
16                }
17            }
18            
19            else{
20                curr = curr.next;
21            }
22        }
23        return fake.next;      
24    }
25}