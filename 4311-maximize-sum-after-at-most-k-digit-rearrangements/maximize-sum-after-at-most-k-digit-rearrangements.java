class Solution {
    public long rearrangement(int num)
    {
        int freq[]=new int[10];
        while(num>0)
        {
            freq[num%10]++;
            num=num/10;
        }
        long ans=0;
        for(int i=9;i>=0;i--)
        {
            while(freq[i]>0)
            {
                ans=ans*10+i;
                freq[i]--;
            }
        }
        return ans;
    }
    public long maximizeSum(int[] nums, int k) {
       PriorityQueue<Long>pq=new PriorityQueue<>(Collections.reverseOrder());
       long sum=0;
       for(int i=0;i<nums.length;i++){
        Long gain=rearrangement(nums[i])-nums[i];
        sum+=nums[i];
        pq.offer(gain);
       }
       while(k>0 && pq.peek()>0)
       {
        sum+=pq.peek();
        pq.poll();
        k--;
       }
       return sum; 
    }
}