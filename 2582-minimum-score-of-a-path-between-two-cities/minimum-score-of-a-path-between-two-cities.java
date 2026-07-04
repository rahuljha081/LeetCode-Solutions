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
        Queue<Integer> q=new LinkedList<>();
        q.add(n);
        boolean vis[]=new boolean[n+1];
        int ans=Integer.MAX_VALUE;
        ArrayList<Integer> arr=new ArrayList<>();
        while(!q.isEmpty()){
            int val=q.poll();
            for(int i=0;i<adj.get(val).size();i++){
                int neigh_node=adj.get(val).get(i).node;
                if(vis[neigh_node]==false){
                    arr.add(neigh_node);
                    vis[neigh_node]=true;
                    q.add(neigh_node);
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