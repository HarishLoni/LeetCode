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
    public boolean hasPathSum(TreeNode root, int targetSum) {
       if(root==null){
           return false;
       }
       return dfs(root,targetSum);
    }
    
    public boolean dfs(TreeNode root,int target){
        if(root==null){
            return false;
        }
        target-=root.val;
        if(root.left==null && root.right==null){
            return (target==0);
        }
        return dfs(root.left,target) || dfs(root.right,target);
    }
}