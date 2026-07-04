class Solution {
    class Pair{
        int node;
        int distance;
        Pair(int node,int distance){
            this.node=node;
            this.distance=distance;
        }
    }
    public int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<roads.length;i++){
            int from=roads[i][0];
            int to=roads[i][1];
            int dist=roads[i][2];
            adj.get(to).add(new Pair(from,dist));
            adj.get(from).add(new Pair(to,dist));
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(n,0));
        boolean vis[]=new boolean[n+1];
        int ans=Integer.MAX_VALUE;
        ArrayList<Integer> arr=new ArrayList<>();
        while(!q.isEmpty()){
            Pair p=q.poll();
            int curr_node=p.node;
            for(int i=0;i<adj.get(curr_node).size();i++){
                int neigh_node=adj.get(curr_node).get(i).node;
                if(vis[neigh_node]==false){
                    arr.add(neigh_node);
                    vis[neigh_node]=true;
                    q.add(new Pair(neigh_node,0));
                }

            }
        }
        for(int i=0;i<arr.size();i++){
            int node=arr.get(i);
            for(int j=0;j<adj.get(node).size();j++){
                int res=adj.get(node).get(j).distance;
                if(res<ans){
                    ans=res;
                }
            }
        }
        return ans;
    }
}