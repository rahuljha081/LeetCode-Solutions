class Solution {
    public boolean canJump(int[] nums) {
        int max_index=0;
        for(int i=0;i<nums.length;i++){
            if(i>max_index){
                return false;
            }
            if(max_index>=nums.length-1){
                return true;
            }
            int temp_index=i+nums[i];
            max_index=Math.max(temp_index,max_index);
        }
        return true;
    }
}