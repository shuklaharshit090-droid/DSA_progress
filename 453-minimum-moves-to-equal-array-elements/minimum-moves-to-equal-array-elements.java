class Solution {
    public int minMoves(int[] nums) {
       Arrays.sort(nums);
       int num=nums[0];
       int res=0;
       for(int i=0;i<nums.length;i++)
       {
            res+=Math.abs(num-nums[i]);
       } 
       return res;
    }
}