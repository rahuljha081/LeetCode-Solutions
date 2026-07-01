class Solution {
    class Pair{
        int row;
        int col;
        int wt;
        Pair(int row,int col,int wt){
            this.row=row;
            this.col=col;
            this.wt=wt;
        }
    }
    int rowDirection[]={0,0,-1,1};
    int colDirection[]={1,-1,0,0};
    boolean isValid(int r,int c,int tr,int tc){
        if(r<tr&&c<tc&&r>=0&&c>=0) return true;
        return false;
    }
    public int minimumEffortPath(int[][] heights) {
        int dist[][]=new int[heights.length][heights[0].length];
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights[0].length;j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        dist[0][0]=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.wt-b.wt);
        pq.add(new Pair(0,0,0));
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int curr_row=p.row;
            int curr_col=p.col;
            int curr_wt=p.wt;
            if(curr_row==heights.length-1&&curr_col==heights[0].length-1) return curr_wt;
            for(int i=0;i<4;i++){
                int new_row=curr_row+rowDirection[i];
                int new_col=curr_col+colDirection[i];
                if(isValid(new_row,new_col,heights.length,heights[0].length)){
                    int diff=Math.abs(heights[new_row][new_col]-heights[curr_row][curr_col]);
                    int diff1=Math.max(diff,curr_wt);
                    if(dist[new_row][new_col]>diff1){
                        dist[new_row][new_col]=diff1;
                        pq.add(new Pair(new_row,new_col,diff1));
                    }
                }
            }
        }
        return 0;
    }
}