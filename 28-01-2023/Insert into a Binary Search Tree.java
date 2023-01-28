Insert into a Binary Search Tree
----------------------------------------------

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
            return new TreeNode(val);
        TreeNode result=insert(root,val);
        return root;
    }
    public TreeNode insert(TreeNode curr,int val){
        if(curr==null)
            return new TreeNode(val);
        if(val<curr.val)
            curr.left=insert(curr.left,val);
        if(val>curr.val)
            curr.right=insert(curr.right,val);
        return curr;
    }
}