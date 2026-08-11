// Last updated: 8/11/2026, 6:10:52 PM
1class Solution {
2   public int[] maxSlidingWindow(int[] a, int k) {		
3		if (a == null || k <= 0) {
4			return new int[0];
5		}
6		int n = a.length;
7		int[] r = new int[n-k+1];
8		int ri = 0;
9		
10		Deque<Integer> q = new ArrayDeque<>();
11		for (int i = 0; i < a.length; i++) {
12		
13			while (!q.isEmpty() && q.peek() < i - k + 1) {
14				q.poll();
15			}
16			
17			while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
18				q.pollLast();
19			}
20			
21			q.offer(i);
22			if (i >= k - 1) {
23				r[ri++] = a[q.peek()];
24			}
25		}
26		return r;
27	}
28}