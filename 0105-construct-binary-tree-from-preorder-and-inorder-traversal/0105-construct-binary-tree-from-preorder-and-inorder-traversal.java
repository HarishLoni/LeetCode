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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root=buildtree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
    
    public TreeNode buildtree(int[] preorder,int prest,int preen,int[] inorder,int inst,int         inen,Map<Integer,Integer> map){
        
        if(prest>preen || inst>inen){
            return null;
        }
        TreeNode root=new TreeNode(preorder[prest]);        
        int inroot=map.get(preorder[prest]);
        int numsleft=inroot-inst;
        
        root.left=buildtree(preorder,prest+1,prest+numsleft,inorder,inst,inroot-1,map);
        root.right=buildtree(preorder,prest+numsleft+1,preen,inorder,inroot+1,inen,map);
        
        return root;
    }
}