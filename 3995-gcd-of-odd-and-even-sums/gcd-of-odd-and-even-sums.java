class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n<=2) return n;
        int sumOdd=0;
        int sumEven=0;
        int c1=0;
        int c2=0;
        int i=0;
        while(c1!=n||c2!=n){
            if(i%2==0){
                sumEven+=i;
                i++;
                c2++;
            }else{
                sumOdd+=i;
                i++;
                c1++;
            }
        }
        int val=Math.min(sumOdd,sumEven)/2;
        for(int j=val;j>=1;j--){
            if(sumOdd%j==0&&sumEven%j==0){
                return j;
            }
        }
        return n;
    }
}