class Pair implements Comparable<Pair>{
    int y;
    int count;
    Pair(int y,int count){
        this.y=y;
        this.count=count;
    }
    public int compareTo(Pair P){
        if(this.count!=P.count) return Integer.compare(this.count,P.count);
        return Integer.compare(this.y,P.y);
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair>pq=new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
         if(!map.containsKey(nums[i])) map.put(nums[i],1);
         else{
            int freq=map.get(nums[i]);
            map.put(nums[i],freq+1);
         }
        }
        // PriorityQueue<Pair>pq=new PriorityQueue<>();
        for(int i:map.keySet()){
            int y=i;
            int count=map.get(i);
            pq.add(new Pair(y,count));
        }
        int []ans=new int[k];
        for(int i=k-1;i>=0;i--)
        {
            Pair temp=pq.remove();
            ans[i]=temp.y;
        }
        return ans;
    }
}