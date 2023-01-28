Search in a Binary Search Tree
--------------------------------------------------------

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return null;
        if(root.val==val)
            return root;
        TreeNode Data=(root.val>val)?searchBST(root.left,val):searchBST(root.right,val);
        return Data;
    }
}