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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        TreeNode root=buildtree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
        
        return root;
    }
    
    private TreeNode buildtree(int[] inorder,int inst,int inen,int[] postorder,int post,int poen,Map<Integer,Integer> map){
        
        if(inst>inen || post>poen){
            return null;
        }
        TreeNode root=new TreeNode(postorder[poen]);
        
        int inroot=map.get(postorder[poen]);
        int numsleft=inroot-inst;
        
        root.left=buildtree(inorder,inst,inroot-1,postorder,post,post+numsleft-1,map);
        
        root.right=buildtree(inorder,inroot+1,inen,postorder,post+numsleft,poen-1,map);
        
        return root;
    }
}