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
        while(!q.isEmpty()){
            ArrayList<Integer> level=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                level.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            arr.add(level);
        }
        ArrayList<Integer> levelArr=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<arr.size();i++){
            int sum=0;
            for(int j=0;j<arr.get(i).size();j++){
                sum+=arr.get(i).get(j);
            }
            if(sum>max){
                max=sum;
                index=i+1;
            }
        }
        return index;
    }
}
