class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int i=min;
        while(i>0){
            if(min%i==0&&max%i==0){
                return i;
            }
            i--;
        }
        return -1;
    }
}