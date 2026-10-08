// Last updated: 10/8/2026, 8:54:46 AM
1class Solution {
2	public String multiply(String num1, String num2) {
3		if ("0".equals(num1) || "0".equals(num2))
4			return "0";
5
6		int[] ans = new int[num1.length() + num2.length() - 1];
7
8		for (int i = 0; i < num1.length(); i++) {
9			for (int j = 0; j < num2.length(); j++) {
10				ans[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
11			}
12		}
13
14		for (int i = ans.length - 1; i > 0; i--) {
15			ans[i - 1] += ans[i] / 10;
16			ans[i] %= 10;
17		}
18
19		StringBuilder sb = new StringBuilder();
20		for (int i : ans) {
21			sb.append(i);
22		}
23
24		return sb.toString();
25	}
26
27}