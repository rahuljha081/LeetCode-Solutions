class Solution {
    int productOfDigit(int n){
        int product=1;
        while(n>0){
            int val=n%10;
            product*=val;
            n/=10;
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            int val=productOfDigit(n);
            if(val%t==0){
                return n;
            }
            n++;
        }
        
    }
}