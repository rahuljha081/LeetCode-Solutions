class Solution {
    public long sumAndMultiply(int n) {
        int digit=1;
        int x=0;
        while(n>0){
            int val=n%10;
            if(val!=0){
                x=val*digit+x;
                digit*=10;
            }
            n/=10;
        }
        int y=x;
        int sum=0;
        while(y>0){
            int val=y%10;
            sum+=val;
            y/=10;
        }
        return (long)x*sum;
    }
}