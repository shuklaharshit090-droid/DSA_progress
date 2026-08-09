class Solution{
    public int smallestidx(int nums[])
    {
        int min=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
                idx=i;
            }
        }
        return idx;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k!=0)
        {
          int idx=smallestidx(nums);
          nums[idx]=nums[idx]*multiplier;
          k=k-1;
        }
        return nums;
    }
}