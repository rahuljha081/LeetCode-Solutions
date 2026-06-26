class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    int [] rowDirection={0,0,-1,1};
    int [] colDirection={1,-1,0,0};
    boolean isValid(int r,int c,int tr,int tc){
        if(r<tr&&c<tc&&r>=0&&c>=0) return true;
        return false;
    }
    public int[][] updateMatrix(int[][] mat) {
        
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    q.add(new Pair(i,j));
                }
            }
        }
        if(q.isEmpty()) return mat;
        int step=1;
        boolean vis[][]=new boolean[mat.length][mat[0].length];
        while(!q.isEmpty()){
            int size=q.size();
            while(size>0){
                size--;
                Pair p=q.poll();
                int curr_row=p.row;
                int curr_col=p.col;
                for(int i=0;i<4;i++){
                    int new_row=curr_row+rowDirection[i];
                    int new_col=curr_col+colDirection[i];
                    if(isValid(new_row,new_col,mat.length,mat[0].length)&&mat[new_row][new_col]==1&&vis[new_row][new_col]==false){
                        mat[new_row][new_col]=step;
                        q.add(new Pair (new_row,new_col));
                        vis[new_row][new_col]=true;
                    }
                }
            }
            step++;
        
        }
        return mat;
    }
}