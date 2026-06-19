class Solution {
    public int largestAltitude(int[] gain) {
        int max=Integer.MIN_VALUE;
        int prev=0;
        for(int i=0;i<gain.length;i++){
            max=Math.max(max,prev);
            prev=prev+gain[i];
            
        }
        max=Math.max(max,prev);
        return max;
    }
}