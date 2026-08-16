public class Solution {
    public void MoveZeroes(int[] nums) {
        int left=0;
        for(int i=left;i<nums.Length;i++){
            if(nums[i]==0){
                continue;
            }
            else if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
    }
}