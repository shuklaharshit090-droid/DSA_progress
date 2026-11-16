class Solution {
    public int solve(int cost[],int i,int memo[])
    {
        if(i>=cost.length) return 0;
        // if(i>cost.length) return 0;
        if(memo[i]!=-1) return memo[i];
        int one=solve(cost,i+1,memo);
        int two=solve(cost,i+2,memo);
        return memo[i]=cost[i]+Math.min(one,two);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int memo[]=new int[n+1];
        Arrays.fill(memo,-1);
        return Math.min(solve(cost,0,memo),solve(cost,1,memo));
    }
}