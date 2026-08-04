class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int small=101;
        int high=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<small)
            {
                small=nums[i];
            }
            if(nums[i]>high)
            {
                high=nums[i];
            }
        }
        HashSet<Integer>set=new HashSet<>();
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int i=small;i<=high;i++)
        {
            if(set.contains(i)==false)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}