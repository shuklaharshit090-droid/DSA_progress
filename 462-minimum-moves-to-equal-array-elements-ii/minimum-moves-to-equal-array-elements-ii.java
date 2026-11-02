class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int num=0;
        if(nums.length%2==0)
        {
        num=nums[(nums.length/2)-1];
        }
        else{
        num=nums[nums.length/2]; 
        }
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=num)
            {
              res+=Math.abs(nums[i]-num);
            }
        }
        return res;
    }
}