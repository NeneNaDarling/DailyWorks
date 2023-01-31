 Two Sum IV - Input is a BST
--------------------------------------------
class Main{
     Stack<TreeNode> Stk=new Stack<TreeNode>();
     int count=1;
     public Main(TreeNode root){
         PushAll(root);
     }
     public void PushAll(TreeNode node){
         while(node!=null){
            Stk.push(node);
            node=node.left;
         }
     }
    public int next(int k){
        if(!Stk.isEmpty()){
        TreeNode temp=Stk.pop();
        PushAll(temp.right);
        if(k==count)
            return temp.val;
        return count++;
        }
        else{
            return 100;
        }
     }
 }
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Main left=new Main(root);
        int i=left.next(k);
        while(i<k){
            i=left.next(k);
        }
        i=left.next(k);
        System.out.println(i);
        return true;
    }
}