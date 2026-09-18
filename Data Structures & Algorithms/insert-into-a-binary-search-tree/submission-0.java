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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            TreeNode temp=new TreeNode(val);
            return temp;
        }
        TreeNode temp=new TreeNode(val);
         helper(root,temp);
         return root;
    }
    public void helper(TreeNode root,TreeNode temp){
        
        if(root.left==null && temp.val<=root.val){
            root.left=temp;
            return;
        }
        if(root.right==null && temp.val>root.val){
            root.right=temp;
            return;
        }
        if(temp.val>root.val){
            helper(root.right,temp);
        }else{
            helper(root.left,temp);
        }
    }
}