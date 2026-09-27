class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            pq.add(stones[i]);
        }
        while(pq.size()>1)
        {
            int y=pq.peek();
            pq.remove(pq.peek());
            if(pq.size()==0) return 0;
            // if(pq.size()==1) return pq.peek();
            int x=pq.peek();
            pq.remove(pq.peek());
            // if(pq.size()==1) return pq.peek();
            if(y!=x){
                pq.add(y-x);
            }
        }
        return (pq.size()==0)?0:pq.peek();
    }
}