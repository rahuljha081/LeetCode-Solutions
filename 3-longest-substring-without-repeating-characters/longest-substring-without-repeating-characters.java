class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0) return 0;
        int left=0;
        int right=0;
        int max_length=0;
        HashSet<Character> set=new HashSet<>();
        while(right<n){
            
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max_length=Math.max(max_length,set.size());
            right++;

        }
        return max_length;
    }
}