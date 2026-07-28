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
 //swapping krdi root ki
 //phir call krdi left sub tree or right sub tree ko bhi invert hone ke liye
 //return kr diya root;
class Solution {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
void invert(TreeNode root){
    if(root==null)return;
   TreeNode temp=root.left;
  root.left=root.right;
   root.right=temp;
invert(root.left);
invert(root.right);

}
}