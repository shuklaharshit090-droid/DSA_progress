class Solution {
    public int helper(int nums[],int index,int memo[]){
        if(index==0) return memo[index]=nums[0];
        if(index<0) return 0;
        if(memo[index]!=-1) return memo[index];
        int take=nums[index]+helper(nums,index-2,memo);
        int notTake=0+helper(nums,index-1,memo);
        return memo[index]=Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        int memo[]=new int[nums.length+1];
        Arrays.fill(memo,-1);
        return helper(nums,nums.length-1,memo);
    }
}