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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null) return -1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int fin=0;
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> arr=new ArrayList<>();
            while(size>0){
                TreeNode node=q.poll();
                size--;
                arr.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            fin=arr.get(0);
        }
        return fin;
    }
}