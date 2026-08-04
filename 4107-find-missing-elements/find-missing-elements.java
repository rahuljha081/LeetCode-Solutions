class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        List<Integer> arr=new ArrayList<>();
        Arrays.sort(nums);
        int first=nums[0];
        int last=nums[nums.length-1];
        for(int i=first;i<=last;i++){
            if(!set.contains(i)){
                arr.add(i);
            }
        }
        return arr;
        
    }
}