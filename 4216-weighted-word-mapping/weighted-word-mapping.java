class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String st="";
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        for(char ch='a';ch<='z';ch++){
            map.put(ch,weights[i]);
            i++;
        }
        for(int j=0;j<words.length;j++){
            int val=0;
            String str=words[j];
            for(int k=0;k<str.length();k++){
                val+=map.get(str.charAt(k));
            }
            val=(val%26)+1;
            int res=26-val;
            char ch=(char)('a'+res);
            st+=ch;
        }
        return st;
    }
}