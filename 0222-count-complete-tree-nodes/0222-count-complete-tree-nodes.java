/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 //approach
 //tree mai teen chize hoti hai
 //root ,left sub tree,right sub tree
 //hum kya krenge root ke liye 1 kiya or recursion ko bola left sub tree or right sub tree ke nodes count kr aao
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
        
    }
}