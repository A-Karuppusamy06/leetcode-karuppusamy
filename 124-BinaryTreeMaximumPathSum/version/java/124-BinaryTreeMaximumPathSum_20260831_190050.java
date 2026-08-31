// Last updated: 8/31/2026, 7:00:50 PM
1public class Solution {
2    int max = Integer.MIN_VALUE;
3    
4    public int maxPathSum(TreeNode root) {
5        helper(root);
6        return max;
7    }
8    
9    int helper(TreeNode root) {
10        if (root == null) return 0;
11        
12        int left = Math.max(helper(root.left), 0);
13        int right = Math.max(helper(root.right), 0);
14        
15        max = Math.max(max, root.val + left + right);
16        
17        return root.val + Math.max(left, right);
18    }
19}