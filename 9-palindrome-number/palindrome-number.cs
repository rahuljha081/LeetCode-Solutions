public class Solution {
    public bool IsPalindrome(int x) {
        if(x==0) return true;
        if(x<0) return false;
        string st="";
        int temp=x;
        while(temp!=0){
            int val=temp%10;
            temp/=10;
            st+=val.ToString();
        }
        string str=new string(st.Reverse().ToArray());
        return (str==st);
    }
}