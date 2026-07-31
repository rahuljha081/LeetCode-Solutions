class Solution {
    class Pair{
        char c;
        int val;
        Pair(char c,int val){
            this.c=c;
            this.val=val;
        }
    }
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.val-a.val);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }
        int step=1;
        int result=0;
        int countPosition=0;
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int value=p.val;
            countPosition++;
            result=result+value*step;
            if(countPosition==8){
                step++;
                countPosition=0;
            }
        }
        return result;
    }
}