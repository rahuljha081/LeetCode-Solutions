public class Solution {
    public int[] TopKFrequent(int[] nums, int k) {
        HashSet<int> set=new HashSet<int>();
        List<int> arr=new List<int>();
        for(int i=0;i<nums.Length;i++){
            if(!set.Contains(nums[i])){
                arr.Add(nums[i]);
                set.Add(nums[i]);
            }
        }

        Dictionary<int,int> map=new Dictionary<int,int>();
        for(int i=0;i<nums.Length;i++){
            if(map.ContainsKey(nums[i])){
                map[nums[i]]=map[nums[i]]+1;
            }else{
                map.Add(nums[i],1);
            }
        }
        PriorityQueue<int,int> pq=new PriorityQueue<int,int>();
        for(int i=0;i<arr.Count;i++){
            pq.Enqueue(arr[i],-(map[arr[i]]));
        }
        int []result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=pq.Dequeue();
        }
        return result;

    }
}