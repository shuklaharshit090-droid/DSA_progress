class Solution {
    public int countKDifference(int[] nums, int k) {
        int freq[]=new int[101];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-k>=1) count+=freq[nums[i]-k];
            if(nums[i]+k<=100) count+=freq[nums[i]+k];
            freq[nums[i]]++;
        }
        return count;
    }
}