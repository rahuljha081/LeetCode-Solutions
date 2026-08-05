class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> st=new Stack();
       if(s.length()==0) return "";
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()){
                if(i!=0&&s.charAt(i)==st.peek()){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        String result=str.reverse().toString();
        return result;
    }
}