class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] maxA=new int[nums.length];
        int[] minA=new int[nums.length];
        maxA[0]=nums[0];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            minA[i]=Math.min(min,nums[i]);
            min=minA[i];
        }
        for(int i=0;i<nums.length;i++){
            maxA[i]=Math.max(max,nums[i]);
            max=maxA[i];
        }
        for(int i=0;i<nums.length;i++){
            int val=maxA[i]-minA[i];
            if(val<=k) return i;
        }
        return -1;
    }
}