// Last updated: 8/11/2026, 6:30:40 PM
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            int g = gcd(curr.val, curr.next.val);

            ListNode node = new ListNode(g);
            node.next = curr.next;
            curr.next = node;

            curr = node.next;
        }

        return head;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}