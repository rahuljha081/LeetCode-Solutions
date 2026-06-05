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
    public int maxLevelSum(TreeNode root) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        Queue <TreeNode> q=new LinkedList<>();
        if(root==null) return 0;
        q.add(root);
        int max=Integer.MIN_VALUE;
        int Finallevel=-1;
        int curr_level=0;
        while(!q.isEmpty()){
            ArrayList<Integer> level=new ArrayList<>();
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                sum+=node.val;
                level.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            
            if(sum>max){
                max=sum;
                Finallevel=curr_level+1;
            }
            curr_level++;
        }
        return Finallevel;
    }
}
