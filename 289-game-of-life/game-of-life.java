class Solution {
    boolean isValid(int r,int c,int tr,int tc){
        if(r>=0&&c>=0&&tr>r&&tc>c) return true;
        return false;
    }
    int[] rowDirection = {-1,-1,-1, 0,0, 1,1,1};
    int[] colDirection = {-1, 0, 1,-1,1,-1,0,1};
    public void gameOfLife(int[][] board1) {
        
        int n=board1.length;
        int m=board1[0].length;
        int board[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j]=board1[i][j];
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<m;j++){
                int liveNeigh=0;
                int val=board[i][j];
                for(int k=0;k<8;k++){
                    int new_row=i+rowDirection[k];
                    int new_col=j+colDirection[k];
                    if(isValid(new_row,new_col,n,m)&&board[new_row][new_col]==1){
                        liveNeigh++;
                    }
                }
                if(val==1){
                    if(liveNeigh>3){
                        board1[i][j]=0;                                             
                    }else if(liveNeigh<2){
                        board1[i][j]=0;  
                    }
                }else if(val==0){
                    if(liveNeigh==3){
                        board1[i][j]=1;
                    }
                }
            }
        }
    }
}