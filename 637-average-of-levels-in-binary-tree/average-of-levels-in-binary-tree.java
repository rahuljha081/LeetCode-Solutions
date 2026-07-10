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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            long sum=0;
            int size=q.size();
            int count=size;
            while(size>0){
                TreeNode n=q.poll();
                size--;;
                sum+=n.val;
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
            double average =(double) sum/count;
            res.add(average);
        }
        return res;
    }
}