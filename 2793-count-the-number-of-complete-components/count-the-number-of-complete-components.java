class Solution {
     ArrayList<Integer> bfs(int i,boolean vis[],ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        q.add(i);
        arr.add(i);
        vis[i]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int j=0;j<adj.get(node).size();j++){
                int neigh=adj.get(node).get(j);
                if(vis[neigh]==false){
                    vis[neigh]=true;
                    q.add(neigh);
                    arr.add(neigh);
                }
            }
        }
        return arr;
    }
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int from=edges[i][0];
            int to=edges[i][1];
            adj.get(from).add(to);
            adj.get(to).add(from);
        }
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        boolean vis[]=new boolean[adj.size()];
        for(int i=0;i<vis.length;i++){
            if(vis[i]==false){
                res.add(bfs(i,vis,adj));
            }
        }
        int count=0;
        for(int i=0;i<res.size();i++){
            for(int j=0;j<res.get(i).size();j++){
                int shouldSize=res.get(i).size()-1;
                if(adj.get(res.get(i).get(j)).size()!=shouldSize){
                    break;
                }
                else if(adj.get(res.get(i).get(j)).size()==shouldSize&&j==res.get(i).size()-1){
                    count++;
                }
            }
        }
        return count;
    }
}