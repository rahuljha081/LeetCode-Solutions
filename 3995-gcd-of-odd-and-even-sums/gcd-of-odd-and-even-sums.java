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
        int a=Math.max(sumOdd,sumEven);
        int b=Math.min(sumOdd,sumEven);
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}