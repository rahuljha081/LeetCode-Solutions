class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n<=1) return n;
        int max=Integer.MIN_VALUE;
        int start=1;
        int right=s.length()-1;
        HashSet<Character> set=new HashSet<>();
        set.add(s.charAt(0));
        int curr=1;
        int remove_index=0;
        while(start<=right){
            if(set.contains(s.charAt(start))){
                max=Math.max(max,curr);
                while(set.contains(s.charAt(start))){
                    set.remove(s.charAt(remove_index));
                    remove_index++;
                    curr--;
                }

            }
            set.add(s.charAt(start));
            start++;
            curr++;
        }
        max=Math.max(max,curr);
        return max;
    }
}