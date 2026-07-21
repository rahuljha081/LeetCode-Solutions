class Solution {
    public int trap(int[] height) {
        if(height.length == 0) return 0;
        int prefixsum[]=new int[height.length];
        prefixsum[0]=height[0];
        int suffixsum[]=new int[height.length];
        for(int i=1;i<height.length;i++){
            prefixsum[i]=Math.max(height[i],prefixsum[i-1]);
        }
        suffixsum[height.length - 1] = height[height.length - 1];
        for(int i=height.length-2;i>=0;i--){
            suffixsum[i]=Math.max(height[i],suffixsum[i+1]);
        }
        int res=0;
        for(int i=1;i<height.length-1;i++){
            int leftMax=prefixsum[i];
            int rightMax=suffixsum[i];
            int val=Math.min(leftMax,rightMax);
            if(val>height[i]){
                res+=val-height[i];
            } 
        }
        return res;
    }
}