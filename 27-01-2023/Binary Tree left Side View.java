Binary Tree Right Side View


class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null)
            return result;
        Queue<TreeNode> Q=new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()){
            int n=Q.size();
            for(int i=0;i<n;i++){
                TreeNode curr=Q.poll();
                if(i==0)
                    result.add(curr.val);
                if(curr.left!=null)
                    Q.add(curr.left);
                if(curr.right!=null)
                    Q.add(curr.right);
            }
        }
        return result;
    }
}