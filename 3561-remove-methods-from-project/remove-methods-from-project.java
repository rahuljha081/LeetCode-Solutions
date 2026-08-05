class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer> res=new ArrayList<>();
        int m=invocations.length;
        boolean suspecious[]=new boolean[n];
        suspecious[k]=true;
        Queue<Integer> q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        q.add(k);
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
         for(int i=0;i<m;i++){
            int a=invocations[i][0];
            int b=invocations[i][1];
            adj.get(a).add(b);
         }
         boolean vis[]=new boolean[n];
         vis[k]=true;
         while(!q.isEmpty()){
            int val=q.poll();
            suspecious[val]=true;
            for(int i=0;i<adj.get(val).size();i++){
                if(vis[adj.get(val).get(i)]==false){
                    q.add(adj.get(val).get(i));
                    vis[adj.get(val).get(i)]=true;
                }
            }
         }
        
       for(int i=0;i<invocations.length;i++){
    int u = invocations[i][0];
    int v = invocations[i][1];

    if(!suspecious[u] && suspecious[v]){
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<n;j++){
            ans.add(j);
        }
        return ans;
    }
}
        for(int i=0;i<suspecious.length;i++){
            if(suspecious[i]==false){
                res.add(i);
            }
        }
        return res;
        
    }
}