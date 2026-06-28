// Last updated: 6/28/2026, 12:54:14 PM
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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> result = new ArrayList<>();
19        if(root == null){
20            return result;
21        }
22
23        Queue<TreeNode> queue = new LinkedList<>();
24        queue.add(root);
25
26        while(!queue.isEmpty()){
27            int size = queue.size();
28
29            for(int level = 0; level < size; level++){
30                TreeNode currNode = queue.poll();
31
32                if(level == size - 1){
33                    result.add(currNode.val);
34                }
35
36                if(currNode.left != null){
37                    queue.add(currNode.left);
38                }
39                if(currNode.right != null){
40                    queue.add(currNode.right);
41                }
42            }
43        }
44        return result;
45    }
46}
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68