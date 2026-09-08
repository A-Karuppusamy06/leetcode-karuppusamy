// Last updated: 9/8/2026, 9:48:56 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> verticalTraversal(TreeNode root) {
18        Queue<TreeNode> queue = new LinkedList<>();
19        List<List<Integer>> li = new ArrayList<>();
20        HashMap<TreeNode,int[]> map = new HashMap<>();
21        if(root == null) return li;
22        map.put(root , new int[]{0,0});
23        queue.offer(root);
24        
25        while(!queue.isEmpty()){
26            int size = queue.size();
27            for(int i = 0 ; i<size ; i++){
28                TreeNode node = queue.poll();
29                if(node.left != null){
30                    map.put(node.left , new int[]{map.get(node)[0]+1 , map.get(node)[1]-1});
31                    queue.offer(node.left);
32                }
33                if(node.right != null){
34                    map.put(node.right , new int[]{map.get(node)[0]+1 , map.get(node)[1]+1});
35                    queue.offer(node.right);
36                }
37            }
38        }
39        List<int[]> nodes = new ArrayList<>();
40
41        for (Map.Entry<TreeNode, int[]> entry : map.entrySet()) {
42
43            TreeNode node = entry.getKey();
44            int[] position = entry.getValue();
45
46            nodes.add(new int[]{position[1],position[0],node.val});
47        }
48        nodes.sort((a,b) -> {
49            if(a[0] != b[0]) return Integer.compare(a[0] , b[0]);
50            if(a[1] != b[1]) return Integer.compare(a[1] , b[1]);
51            return Integer.compare(a[2] , b[2]);
52        });
53         List<Integer> l = new ArrayList<>();
54         int prev = nodes.get(0)[0];
55        for(int[] node : nodes){
56           if(node[0] != prev){
57            li.add(l);
58            l = new ArrayList<>();
59            prev = node[0];
60           }
61           l.add(node[2]);
62
63        }
64        li.add(l);
65        return li;
66    }
67}