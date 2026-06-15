class Solution {
    public int majorityElement(int[] nums) {
        int element=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0||nums[i]==element){
                element=nums[i];
                count++;
            }
            if(nums[i]!=element){
                count--;
            }
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element){
                c++;
            }
        }
        if(c>nums.length/2) return element;
        return -1;
    }
}