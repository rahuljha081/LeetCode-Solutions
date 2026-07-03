class Solution {
    void solve(int[] nums,List<List<Integer>> res,ArrayList<Integer> temp,int n,int i){
        if(i==n){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        solve(nums,res,temp,n,i+1);
        temp.remove(temp.size()-1);
        solve(nums,res,temp,n,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        int n=nums.length;
        solve(nums,res,temp,n,0);
        return res;
    }
}