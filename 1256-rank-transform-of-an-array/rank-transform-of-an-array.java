class Solution {
    class Pair{
        int value;
        int idx;
        Pair(int value,int idx){
            this.value=value;
            this.idx=idx;
        }
    }
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.value-b.value);
        for(int i=0;i<arr.length;i++){
            pq.add(new Pair(arr[i],i));
        }
        int [] res=new int[arr.length];
        Integer prev=null;
        int rank=1;
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int val=p.value;
            int idx=p.idx;
           if(prev==null||val!=prev){
                res[idx]=rank;
                rank++;
                prev=arr[idx];
            }else{
                res[idx]=rank-1;
            }
        }
        return res;
    }
}