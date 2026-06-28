// Last updated: 6/28/2026, 12:53:44 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> result = new ArrayList<>();
19
20        if(root == null){
21            return result;
22        }
23
24        Queue<TreeNode> queue = new LinkedList<>();
25        queue.add(root);
26
27        while(!queue.isEmpty()){
28            int size = queue.size();
29            List<Integer> currList = new ArrayList<>();
30
31            for(int i = 0; i < size; i++){
32                TreeNode currNode = queue.poll();
33                currList.add(currNode.val);
34
35                if(currNode.left != null){
36                    queue.add(currNode.left);
37                }
38                if(currNode.right != null){
39                    queue.add(currNode.right);
40                }
41            }
42            result.add(currList);
43        }
44        return result;
45    }
46}