Binary Tree Level Order Traversal II
--------------------------------------------------------

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> Answer=new ArrayList<>();
        if(root==null)
            return Answer;
        Queue<TreeNode> Q=new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()){
            int count=Q.size();
            List<Integer> Sub=new ArrayList<>();
            for(int i=0;i<count;i++){
                TreeNode data=Q.poll();
                Sub.add(data.val);
                if(data.left!=null)
                    Q.add(data.left);
                if(data.right!=null)
                    Q.add(data.right);
            }
            Answer.add(Sub);
        }
        Collections.reverse(Answer);
        return Answer;
        
    }
}