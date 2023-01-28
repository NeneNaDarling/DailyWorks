Path Sum
---------------------------------------

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean trf=preorder(root,targetSum);
        return trf;
    }
    boolean preorder(TreeNode root,int target){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null)
            return target-root.val==0;
        boolean a=preorder(root.left,target-root.val);
        boolean b=preorder(root.right,target-root.val);
        return a || b;

    }
}