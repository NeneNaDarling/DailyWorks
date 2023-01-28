 Merge Two Binary Trees
--------------------------------------------------------

class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return Combine(root1,root2);
    }
    TreeNode Combine(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null){
            return null;
        }
        if(t1!=null && t2==null)
            return t1;
        if(t1==null && t2!=null)
            return t2;
        TreeNode CombineTree=new TreeNode(t1.val+t2.val);
        CombineTree.left=Combine(t1.left,t2.left);
        CombineTree.right=Combine(t1.right,t2.right);
        return CombineTree;
    }
}