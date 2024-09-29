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
    int sum=0;
    public int sumNumbers(TreeNode root) {
        getsum(root,0);
        return sum;
    }
    
    private void getsum(TreeNode root,int cur){
        if(root==null){
            return;
        }
        
        cur=cur*10+root.val;
        
        if(root.left==null && root.right==null){
            sum+=cur;
            return;
        }
        
        getsum(root.left,cur);
        getsum(root.right,cur);
    }
}