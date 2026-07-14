class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(nums[i]-nums[i+1])>max){
                max=Math.abs(nums[i]-nums[i+1]);
            }
        }
        return max;
    }
}