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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList <Integer> list=new ArrayList<>();
 count(root,list);
 return list;

        
    }
    //jbb list ya arraylist return krnii ho to function ko return type wala mtt bnao
    //bus list ko passs krdo 
    //at the end list ko return krdo
   void count(TreeNode root,List<Integer> list){
     if(root==null)return;
        list.add(root.val);
        //return naii likha kyuki void hai return type
        //pre hota hai
        //pehle root
        //then left 
        //then right
         count(root.left,list);
         count(root.right,list);
   
    } 
}