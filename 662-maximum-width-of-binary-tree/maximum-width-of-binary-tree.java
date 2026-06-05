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
    class Pair{
        TreeNode node;
        int idx;
        Pair(TreeNode node,int idx){
            this.node=node;
            this.idx=idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null) return 0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int max=0;
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> temp=new ArrayList<>();
            while(size>0){
                Pair p=q.poll();
                size--;
                temp.add(p.idx);
                if(p.node.left!=null) q.add(new Pair(p.node.left,2*p.idx+1));
                if(p.node.right!=null) q.add(new Pair(p.node.right,2*p.idx+2));
            }
            max=Math.max(max,temp.get(temp.size()-1)-temp.get(0)+1);
        }
        return max;
    }
}