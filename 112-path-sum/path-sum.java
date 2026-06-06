/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean solve(TreeNode root,int targetSum,int currSum){
        if(currSum==targetSum&&(root.left==null&&root.right==null)) return true;
        boolean first=false;
        if(root.left!=null){
            first= solve(root.left,targetSum,currSum+root.left.val);
        }
        boolean second=false;
        if(root.right!=null){
            second=solve(root.right,targetSum,currSum+root.right.val);
        }
        return first||second;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return solve(root,targetSum,root.val);

        
    }
}