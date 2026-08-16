class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=0;
        boolean nonzero=false;
        for(int i=0;i<nums.length;i++)
        {
            xor=nums[i]^xor;
            if(nums[i]!=0)
            {
               nonzero=true;
            }
        }
        if(xor!=0) return n;
        if(nonzero) return n-1;
        return 0;
    }
}