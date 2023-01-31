Convert Sorted Array to Binary Search Tree
--------------------------------------------------------
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBst(nums,0,nums.length-1);
    }
    public TreeNode createBst(int[] nums,int start,int end){
        if(start>end)
            return null;
        int mid=(start+end)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=createBst(nums,start,mid-1);
        node.right=createBst(nums,mid+1,end);
        return node;
    }
  }