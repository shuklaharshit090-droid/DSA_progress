class Solution {
    public int solve(int nums[],int start,int end){
        int n=end-start+1;
        if(n==1) return nums[start];
        int dp[]=new int[n+1];
        dp[1]=nums[start];
        dp[2]=Math.max(nums[start],nums[start+1]);
        for(int i=3;i<=n;i++)
        {
            int take=nums[start+i-1]+dp[i-2];
            int notTake=dp[i-1];
            dp[i]=Math.max(take,notTake);
        }
        return dp[n];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int case1=solve(nums,0,n-2);
        int case2=solve(nums,1,n-1);
        return Math.max(case1,case2);
    }
}