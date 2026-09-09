class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long windowSum=0;
        long maxsum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<k;i++)
        {
            windowSum+=nums[i];
            if(!map.containsKey(nums[i])) map.put(nums[i],1);
            else map.put(nums[i],map.get(nums[i])+1);
        }
        if (map.size()==k) maxsum=Math.max(maxsum,windowSum);
        int l=0;
        for(int i=k;i<nums.length;i++)
        {
            windowSum=windowSum+nums[i]-nums[l];
            if(!map.containsKey(nums[i])) map.put(nums[i],1);
            else map.put(nums[i],map.get(nums[i])+1);
            map.put(nums[l],map.get(nums[l])-1);
            if(map.get(nums[l])==0) map.remove(nums[l]);
            l++;
            if(map.size()==k) maxsum=Math.max(maxsum,windowSum);
        }
        return maxsum;
    }
}