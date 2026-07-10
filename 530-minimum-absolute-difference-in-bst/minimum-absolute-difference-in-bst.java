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
    void solve(ArrayList<Integer> arr,TreeNode root){
        if(root==null) return;
        arr.add(root.val);
        solve(arr,root.left);
        solve(arr,root.right);
    }
    public int getMinimumDifference(TreeNode root) {
       ArrayList<Integer> arr=new ArrayList<>();
       solve(arr,root);
       int min=Integer.MAX_VALUE;
       for(int i=0;i<arr.size()-1;i++){
        for(int j=i+1;j<arr.size();j++){
            int num=Math.abs(arr.get(i)-arr.get(j));
            if(num<min){
                min=num;
            }
        }
       }
       return min;
    }
}