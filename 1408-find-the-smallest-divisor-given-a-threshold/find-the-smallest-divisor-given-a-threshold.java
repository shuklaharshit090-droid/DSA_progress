class Solution {
    public long thresh(long a,int nums[])
    {
        long threshValue=0;
        for(int i=0;i<nums.length;i++)
        {
            threshValue+=(long)Math.ceil((double)nums[i]/a);
        }
        return threshValue;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }
        long l=1;
        long h=max;
        long ans=0;
        while(l<=h){
            long mid=(l+h)/2;
            if(thresh(mid,nums)<=threshold){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return (int)ans;
    }
}