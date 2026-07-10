/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        int step=0;
        if(root==null) return 0;
        step=1;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            boolean done=false;
            while(size>0){
                size--;
                Node n=q.poll();
                for(Node child:n.children){
                    q.add(child);
                    done=true;
                }
            }
            if(done==true){
                step++;
            }
        }
        return step;
    }
}