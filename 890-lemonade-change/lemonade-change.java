class Solution {
    public boolean lemonadeChange(int[] bills) {
        int no5=0;
        int no10=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                no5++;
            }else if(bills[i]==10){
                if(no5<1){
                    return false;
                }else{
                    no5--;
                    no10++;
                }
            }else if(bills[i]==20){
                if(no5>0&&no10>0){
                    no5--;
                    no10--;
                }else if(no5>=3){
                    no5-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}