class Solution {
    public void moveZeroes(int[] nums) {
        int low=0;
        int mid=0;
        while(mid<nums.length)
        {
            if(nums[mid]!=0)
            {
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
            }
            mid++;
        }
    }
}