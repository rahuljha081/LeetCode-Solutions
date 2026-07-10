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
    void  solve(TreeNode root ,ArrayList<Integer> arr){
        if(root==null) return ;
        solve(root.left,arr);
        arr.add(root.val);
        solve(root.right,arr);

    }
    public boolean findTarget(TreeNode root, int k) {
        
        if(root==null&&k==0) return true;
        if(root==null&&k!=0) return false;
        ArrayList<Integer> arr=new ArrayList<>();
        solve(root,arr);
        if(arr.size()==1)return false;
        HashSet<Integer> set=new HashSet();
        for(int i=0;i<arr.size();i++){
             if(set.contains(k - arr.get(i))){
                return true;
            }

            set.add(arr.get(i));
        }
        return false;
    }
}