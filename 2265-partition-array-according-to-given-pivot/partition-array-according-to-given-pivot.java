class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int s=0;
        int l=0;
        int e=0;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                s++;
            }
            if(nums[i]>pivot){
                l++;
            }
            if(nums[i]==pivot){
                e++;
            }
        }
        int li=s+e;
        int si=0;
        int ei=s;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                res[li]=nums[i];
                li++;
            }
            if(nums[i]<pivot){
                res[si]=nums[i];
                si++;
            }
            if(nums[i]==pivot){
                res[ei]=nums[i];
                ei++;
            }
        }
        return res;
    }
}