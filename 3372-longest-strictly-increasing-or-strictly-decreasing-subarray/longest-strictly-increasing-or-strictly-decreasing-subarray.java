class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxcount=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=1;
            int j=i+1;
            int temp=i;
           while(j<nums.length && nums[j]>nums[temp])
           {
            count++;
            j++;
            temp++;
           }
           maxcount=Math.max(maxcount,count);
        }
        for(int i=0;i<nums.length;i++)
        {
            int count=1;
            int j=i+1;
            int temp=i;
           while(j<nums.length && nums[j]<nums[temp])
           {
            count++;
            j++;
            temp++;
           }
           maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }
}