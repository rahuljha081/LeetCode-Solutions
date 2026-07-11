class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int count=0;
        int n=g.length;
        int m=s.length;
        int i=0;
        int j=0;
        while(n>0&&m>0){
            if(g[i]<=s[j]){
                i++;
                j++;
                count++;
                n--;
                m--;
            }else if(g[i]>s[j]){
                j++;
                m--;
            }

        }
        return count;
    }
}