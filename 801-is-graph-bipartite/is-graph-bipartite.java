class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<Integer> q=new LinkedList<>();
        boolean red[]=new boolean[graph.length];
        boolean blue[]=new boolean[graph.length];
        for(int j=0;j<graph.length;j++){
            
            if(blue[j]==true||red[j]==true) continue;
            red[j]=true;
            q.add(j);
            while(!q.isEmpty()){
                int val=q.poll();
                for(int i=0;i<graph[val].length;i++){
                   if(red[val]==true){
                      if(red[graph[val][i]]==true) return false;
                      if(blue[graph[val][i]]==true){
                        continue;
                      }else{
                        blue[graph[val][i]]=true;
                        q.add(graph[val][i]);
                      }
                    
                    }else if(blue[val]==true){
                       if(blue[graph[val][i]]==true) return false;
                       if(red[graph[val][i]]==true){
                           continue;
                       }else{
                        red[graph[val][i]]=true;
                        q.add(graph[val][i]);
                       }
                    }
                }
            }
        }
        return true;
    }
}