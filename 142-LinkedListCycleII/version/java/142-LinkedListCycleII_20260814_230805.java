// Last updated: 8/14/2026, 11:08:05 PM
1public class Solution {
2    public ListNode detectCycle(ListNode head) {
3        ListNode slow=head;
4        ListNode fast=head;
5        while(fast!=null && fast.next!=null){
6            slow=slow.next;
7            fast=fast.next.next;
8            if(fast==slow){
9                slow=head;
10                while(fast!=slow){
11                    slow=slow.next;
12                    fast=fast.next;
13                }
14                return slow;
15            }
16        }
17        return null;
18    }
19}