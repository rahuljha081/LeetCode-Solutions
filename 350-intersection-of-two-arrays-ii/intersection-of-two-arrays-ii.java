class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l=0;
        ArrayList<Integer> arr=new ArrayList<>();
        // if(nums1.length>nums2.length) l=nums1.length;
        // else l=nums2.length;
        int i=0;
        int j=0;
        int n=nums1.length;
        int m=nums2.length;
        while(i<n&&j<m){
            if(nums1[i]==nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int res[]=new int[arr.size()];
        for(int k=0;k<arr.size();k++){
            res[k]=arr.get(k);
        }
        return res;
       
    }
}