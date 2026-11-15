class Solution {
    // Using memoization:
    // public int helper(int nums[],int index,int memo[]){
    //     if(index==0) return memo[index]=nums[0];
    //     if(index<0) return 0;
    //     if(memo[index]!=-1) return memo[index];
    //     int take=nums[index]+helper(nums,index-2,memo);
    //     int notTake=0+helper(nums,index-1,memo);
    //     return memo[index]=Math.max(take,notTake);
    // }
    // public int rob(int[] nums) {
    //     int memo[]=new int[nums.length+1];
    //     Arrays.fill(memo,-1);
    //     return helper(nums,nums.length-1,memo);
    // }
    // Using Tabulation:
     public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        if(n==1) return dp[n]=nums[0];
        if(n==2) return dp[n]=Math.max(nums[0],nums[1]);
        dp[1]=nums[0];
        dp[2]=Math.max(nums[0],nums[1]);
        for(int i=3;i<=n;i++)
        {
          int take=nums[i-1]+dp[i-2];
          int notTake=0+dp[i-1];
          dp[i]=Math.max(take,notTake);
        }
        return dp[n];
    }
}