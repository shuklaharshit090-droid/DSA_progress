class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[0]>target) return 0;
      int l=0;
      int h=nums.length-1;
      int pos=nums.length;
      while(l<=h)
      {
        int mid=l+(h-l)/2;
        if(nums[mid]<=target)
        {
            if(nums[mid]==target) return mid;
            else{
                pos=mid+1;
                l=mid+1;
            }
        }
        else{
            h=mid-1;
        }
      }  
      return pos;
    }
}