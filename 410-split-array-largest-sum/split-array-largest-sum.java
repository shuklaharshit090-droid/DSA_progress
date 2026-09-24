class Solution {
    public int magic(long a,int nums[]){
        int count=0;
        long capacity=a;
        int i=0;
        while(i<nums.length){
            if(nums[i]<=capacity){
                capacity-=nums[i];
                i++;
            }
            else{
                count++;
                capacity=a;
            }
        }
        count++;
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int start=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            start=Math.max(start,nums[i]);
            sum+=nums[i];
        }
        long ans=-1;
        long l=start;
        long h=sum;
        while(l<=h){
            long mid=(l+h)/2;
            if(magic(mid,nums)<=k)
            {
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