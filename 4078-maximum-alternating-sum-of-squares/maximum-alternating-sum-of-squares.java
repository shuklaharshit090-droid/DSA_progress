class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                nums[i]=nums[i]*-1;
            }
        }
        if(nums.length==1)
        return (long)Math.pow(nums[0],2);
        long ans=0;
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        while(l<r)
        {
          ans=ans+(long)Math.pow(nums[r--],2)-(long)Math.pow(nums[l++],2);
        }
        if(l==r) ans+=(long)Math.pow(nums[r],2);
        return ans;
    }
}