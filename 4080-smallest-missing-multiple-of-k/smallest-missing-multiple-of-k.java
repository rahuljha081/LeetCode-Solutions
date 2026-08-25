class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int right=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>right){
                right=nums[i];
            }
        }
        
        for(int i=1;i<right;i++){
            if(i%k==0&&!set.contains(i)){
                return i;
            }
        }
        int temp=right+1;
        while(true){
            if(temp%k==0){
                return temp;
            }
            temp++;
        }
        
    }
}