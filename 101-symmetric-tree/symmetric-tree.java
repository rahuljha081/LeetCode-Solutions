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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> arr=new ArrayList<>();
            while(size>0){
                size--;
                TreeNode node=q.poll();
                if(node==null){
                    arr.add(null);
                    continue;
                }
                arr.add(node.val);
                q.add(node.left);
                q.add(node.right);
            }
            int start=0;
            int end=arr.size()-1;
            while(start<end){
                if(arr.get(start)!=arr.get(end)) return false;
                else{
                    start++;
                    end--;
                }
            }
        }
        return true;
    }
}