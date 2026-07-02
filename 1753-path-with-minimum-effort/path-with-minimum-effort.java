class Solution {
    class Pair{
        int row;
        int col;
        int distance;
        Pair(int row,int col,int distance){
            this.row=row;
            this.col=col;
            this.distance=distance;
        }
    }
    int rowDirection[]={0,0,-1,1};
    int colDirection[]={1,-1,0,0};
    boolean isValid(int r,int c,int tr,int tc){
        if(r<tr&&c<tc&&r>=0&&c>=0) return true;
        return false;
    }
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int dist[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        dist[0][0]=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.distance-b.distance);
        pq.add(new Pair(0,0,0));
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int curr_row=p.row;
            int curr_col=p.col;
            int dis=p.distance;
            for(int i=0;i<4;i++){
                int new_row=curr_row+rowDirection[i];
                int new_col=curr_col+colDirection[i];
                if(isValid(new_row,new_col,n,m)){
                    int diff=Math.abs(heights[new_row][new_col]-heights[curr_row][curr_col]);
                    int efforts=Math.max(diff,dist[curr_row][curr_col]);
                    if(dist[new_row][new_col]>efforts){
                        dist[new_row][new_col]=efforts;
                        pq.add(new Pair(new_row,new_col,efforts));
                    }
                }
            }
        }
        return dist[n-1][m-1];
    }
}