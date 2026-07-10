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
            ArrayList<Integer> temp=new ArrayList<>();
            int size=q.size();
            while(size>0){
                TreeNode n=q.poll();
                size--;;
                temp.add(n.val);
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
            double average=0;
            long sum=0;
            for(int i=0;i<temp.size();i++){
                sum+=temp.get(i);
            }
            average=(double)sum/temp.size();
            res.add(average);
        }
        return res;
    }
}