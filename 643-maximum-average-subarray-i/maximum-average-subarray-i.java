class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double maxavg=Integer.MIN_VALUE;
        int n=nums.length;
        // k=k%n;
        if(k==0) return 0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        maxavg=Math.max(maxavg,(double)sum/k);
        for(int i=k;i<n;i++)
        {
            sum=sum+nums[i]-nums[i-k];
            maxavg=Math.max(maxavg,(double)sum/k);
        }
        return maxavg;
    }
}