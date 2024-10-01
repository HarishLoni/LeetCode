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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftdepth=leftDepth(root);
        int rightdepth=rightDepth(root);
        
        if(leftdepth==rightdepth){
            return (int)Math.pow(2,leftdepth)-1;
        }else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }
    }
    
    private int leftDepth(TreeNode root){
        int depth=0;
        while(root!=null){
            depth++;
            root=root.left;
        }
        return depth;
    }
    
    private int rightDepth(TreeNode root){
        int depth=0;
        while(root!=null){
            depth++;
            root=root.right;
        }
        return depth;
    }
}