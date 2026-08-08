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
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //base case
       if(p==null && q==null)return true;
       //if first case executed this will not run
       if(p==null || q==null)return false;
       //we wil check case in which its not equal not the case where equal kyuki usme to hum left sub tree or left sub tree dekhenge
    if(p.val!=q.val)return false;
    
    return (isSameTree(p.left,q.left)&&isSameTree(p.right,q.right));
       
       
    }
}

