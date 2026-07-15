class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> str=new ArrayList<>();
        if(n==0) return str;
        for(int i=0;i<n;i++){
            int val=i+1;
            if(val%3==0&&val%5==0){
                str.add("FizzBuzz");
            }else if(val%3==0){
                str.add("Fizz");
            }else if(val%5==0){
                str.add("Buzz");
            }else{
                str.add(Integer.toString(i+1));
            }
        }
        return str;

    }
}