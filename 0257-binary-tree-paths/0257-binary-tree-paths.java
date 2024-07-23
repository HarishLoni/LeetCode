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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        String cur=Integer.toString(root.val);
        
        if(root.left==null && root.right==null){
            result.add(cur);
        }
        if(root.left!=null){
            dfs(root.left,cur,result);
        }
        if(root.right!=null){
            dfs(root.right,cur,result);
        }
        return result;
    }
    
    public void dfs(TreeNode root,String cur,List<String> res){
        cur+="->"+root.val;
        if(root.left==null && root.right==null){
            res.add(cur);
            return;
        }
         if(root.left!=null){
            dfs(root.left,cur,res);
        }
        if(root.right!=null){
            dfs(root.right,cur,res);
        }
    }
}