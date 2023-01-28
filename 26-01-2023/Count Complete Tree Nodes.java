 Count Complete Tree Nodes
--------------------------------------------------------

class Solution {
    public int countNodes(TreeNode root) {
      int count=count(root);
      return count;
    }
    int total=0;
    int count(TreeNode root){
        if(root==null)
            return 0;
        total+=1;
        count(root.left);
        count(root.right);
        return total;
        
    }
}