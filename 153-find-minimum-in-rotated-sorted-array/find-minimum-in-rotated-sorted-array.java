class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if((mid+1==nums.length) || (nums[mid]<=nums[mid+1])) ans=Math.min(nums[mid],ans);
            if(nums[mid]<=nums[h])
            {
               h=mid-1;
            }
            else{
               l=mid+1;
            }
        }
        return ans;
    }
}