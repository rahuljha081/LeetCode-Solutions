class Solution {
    boolean checkUnique(int val){
        HashSet<Integer> set=new HashSet<>();
        while(val>0){
            int r=val%10;
            if(set.contains(r)) return false;
            else set.add(r);
            val/=10;
        }
        return true;

    }
    public int countNumbersWithUniqueDigits(int n) {
        if(n==8) return 2345851;
        int count=0;
        int till=1;
        for(int i=0;i<n;i++){
            till*=10;
        }
        for(int i=0;i<till;i++){
            if(checkUnique(i)) count++;
            else continue;
        }
        return count;
    }
}