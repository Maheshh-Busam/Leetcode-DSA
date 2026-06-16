// Last updated: 6/16/2026, 11:39:19 PM
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
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> result = new ArrayList<>();
19        return inOrder(root, result);
20    }
21
22    public List<Integer> inOrder(TreeNode root, List<Integer> result){
23        if(root == null){
24            return result;
25        }
26
27        inOrder(root.left, result);
28        result.add(root.val);
29        inOrder(root.right, result);
30
31        return result;
32    }
33}