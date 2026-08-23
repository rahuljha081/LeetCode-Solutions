class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int x=n;
        while(x!=0){
            int val=x%10;
            sum+=val;
            x/=10;
        }
        int product=1;
        x=n;
        while(x!=0){
            int val=x%10;
            product*=val;
            x/=10;
        }
        int temp=sum+product;
        if(n%temp==0) return true;
        return false;
    }
}