 Binary Search Tree BSTIterator
----------------------------------------------

class BSTIterator {
    Stack<TreeNode> stack=new Stack<>();
    public BSTIterator(TreeNode root) {
        WalkThroughLeft(root);
    }
    
    public int next() {
        TreeNode Temp=stack.pop();
        WalkThroughLeft(Temp.right);
        return Temp.val;
        
    }
    
    public boolean hasNext() {
        if(!stack.isEmpty())
            return true;
        return false;
    }
    public void WalkThroughLeft(TreeNode root){
        while(root!=null) {
            stack.push(root);
            root=root.left;
        }
    }
}