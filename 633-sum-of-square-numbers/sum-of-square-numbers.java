class Solution {
    public boolean judgeSquareSum(int c) {
        int pre=-1;
        int prev=0;
        for(int i=0;i<=c;i++){
            if((long)i*i>c){
                pre=prev;
                break;
            }else{
                prev=i;
            }
        }
             if(pre == -1){
            pre = prev;
        }
        int left=0;
        int right=pre;
        while(left<=right){
            long val=(long)left*left+(long)right*right;
            if(val==c){
                return true;
            }else if(c>val){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}