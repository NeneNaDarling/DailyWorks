class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> Final=new ArrayList<>();
        if(root==null){
            return Final;
        }
        Queue<TreeNode> Q=new LinkedList<>();
        Q.add(root);
        boolean rightleft=true;
        while(!Q.isEmpty()){
            List<Integer> single=new ArrayList<>();
            int Size=Q.size();
            for(int i=0;i<Size;i++){
                TreeNode curr=Q.poll();
                if(curr.left!=null)
                    Q.add(curr.left);
                if(curr.right!=null)
                    Q.add(curr.right);
                if(rightleft)
                    single.add(curr.val);
                else
                    single.add(0,curr.val);
            }
            Final.add(single);
            rightleft=!rightleft;
        }
        return Final;
    }
}