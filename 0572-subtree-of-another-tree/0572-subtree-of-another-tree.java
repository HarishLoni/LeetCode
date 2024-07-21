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
    
    public String preorder(TreeNode root){
           if(root==null){
               return "null";
           }
           StringBuilder sb=new StringBuilder("^");
           sb.append(root.val);
           sb.append(preorder(root.left));
           sb.append(preorder(root.right));
           
           return sb.toString();
       }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        String s1=preorder(root);
        String s2=preorder(subRoot);
        
        return s1.contains(s2);    
    }
}