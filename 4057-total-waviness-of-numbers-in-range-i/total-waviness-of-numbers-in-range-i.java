class Solution {
    public int totalWaviness(int num1, int num2) {
        String st1=Integer.toString(num1);
        String st2=Integer.toString(num2);
        if(st1.length()<3&&st2.length()<3) return 0;
        int count=0;
        for(int i=num1;i<=num2;i++){
            String s=Integer.toString(i);
            if(s.length()>2){
            for(int j=1;j<s.length()-1;j++){
                if(s.charAt(j)>s.charAt(j-1)&&s.charAt(j)>s.charAt(j+1)){
                    count++;
                }
                if(s.charAt(j)<s.charAt(j-1)&&s.charAt(j)<s.charAt(j+1)){
                    count++;
                }
            }
            }
        }
        return count;
    }
}