class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<=1)return true;
        int maxIndex=0;
        for(int i=0;i<nums.length;i++){
            int ind=nums[i]+i;
            maxIndex=Math.max(maxIndex,ind);
            if(i>=maxIndex) return false;
            if(maxIndex+1>=nums.length) return true;
        }
        return false;
    }
}