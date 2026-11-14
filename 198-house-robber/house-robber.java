class Solution {
    public int solve(int[] nums,int index,int memo[])
    {
        if(index==0) return  memo[index]=nums[0];
        if(index<0) return 0;
        if(memo[index]!=-1) return memo[index];
        int Take=nums[index]+solve(nums,index-2,memo);
        int NotTake=0+solve(nums,index-1,memo);
        return memo[index]=Math.max(Take,NotTake);
    }
    public int rob(int[] nums) {
        int memo[]=new int[nums.length];
        Arrays.fill(memo,-1);
       return solve(nums,nums.length-1,memo);
    }
}