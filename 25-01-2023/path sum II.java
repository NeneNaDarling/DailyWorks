Path Sum II
---------------------------------------

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
         boolean trf=pre(root,targetSum,a,answer);
        return answer;
    }
    boolean pre(TreeNode root,int target , List<Integer> b,List<List<Integer>> answer){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null && target-root.val==0){
            ArrayList<Integer>base=new ArrayList<>(b);
            base.add(root.val);
            answer.add(base);
            return true;
        }
        b.add(root.val);
        boolean aa=pre(root.left,target-root.val,b,answer);
        boolean bb=pre(root.right,target-root.val,b,answer);
        b.remove(b.size()-1);
        return aa || bb;

    }
}