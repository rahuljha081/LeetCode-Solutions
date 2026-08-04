class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        List<Integer> arr=new ArrayList<>();
        
        int min=Collections.min(set);
        int max=Collections.max(set);
        for(int i=min+1;i<=max;i++){
            if(!set.contains(i)){
                arr.add(i);
            }
        }
        return arr;
        
    }
}