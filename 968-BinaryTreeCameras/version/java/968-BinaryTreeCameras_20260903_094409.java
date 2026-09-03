// Last updated: 9/3/2026, 9:44:09 AM
1class Solution {
2    private int NOT_MONITORED = 0;
3    private int MONITORED_NOCAM = 1;
4    private int MONITORED_WITHCAM = 2;
5    private int cameras = 0;
6	
7    public int minCameraCover(TreeNode root) {
8        if (root == null) return 0;
9        int top = dfs(root);
10        return cameras + (top == NOT_MONITORED ? 1 : 0);
11    }
12    
13    private int dfs(TreeNode root) {
14        if (root == null) return MONITORED_NOCAM;
15        int left = dfs(root.left);
16        int right = dfs(root.right);
17        if (left == MONITORED_NOCAM && right == MONITORED_NOCAM) {
18            return NOT_MONITORED;
19        } else if (left == NOT_MONITORED || right == NOT_MONITORED) {
20            cameras++;
21            return MONITORED_WITHCAM;
22        } else {
23            return MONITORED_NOCAM;
24        }
25    }
26}