Increasing Order Search Tree
----------------------------------------------

class Solution {
    List<TreeNode> result=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        in_Order_Traversal(root);
        TreeNode First=result.get(0);
        TreeNode traverse=First;
        for(int i=1;i<result.size();i++){
            traverse.right=result.get(i);
            traverse=traverse.right;
            traverse.left=null;
        }
        return First;
    }
    public void in_Order_Traversal(TreeNode root){
        if(root==null)
            return ;
        in_Order_Traversal(root.left);
        result.add(root);
        in_Order_Traversal(root.right);
    }
}