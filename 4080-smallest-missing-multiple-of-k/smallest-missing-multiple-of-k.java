class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int right=nums[nums.length-1];
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