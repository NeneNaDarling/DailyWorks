Construct Binary Tree from Preorder and Inorder Traversal
-------------------------------------------------------------------
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return Tree(0,0,inorder.length-1,preorder,inorder);
    }
    public TreeNode Tree(int Pstart,int Instart,int Inend,int[] preorder,int[] inorder){
        if(Pstart>preorder.length-1 || Instart>Inend)
            return null;
        TreeNode root=new TreeNode(preorder[Pstart]);
        int inIndex=0;
        for (int i =Instart; i <= Inend; i++) {
        if (inorder[i] == root.val) {
            inIndex = i;
            }
        }
        root.left=Tree(Pstart+1,Instart,inIndex-1,preorder,inorder);
        root.right=Tree(Pstart+inIndex-Instart+1,inIndex+1,Inend,preorder,inorder);
        return root;
    }
}