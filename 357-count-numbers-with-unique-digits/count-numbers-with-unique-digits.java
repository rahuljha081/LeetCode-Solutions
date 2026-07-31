class Solution {
    boolean checkUnique(int val){
  boolean[] set = new boolean[10];

        while(val > 0){
            int r = val % 10;

            if(set[r]) return false;

            set[r] = true;
            val /= 10;
        }

        return true;

    }
    public int countNumbersWithUniqueDigits(int n) {
        
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