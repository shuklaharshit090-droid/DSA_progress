class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int maxseq=nums[0];
        int j=1;
            while(j<nums.length && nums[j-1]+1==nums[j])
            {
                maxseq+=nums[j];
                j++;
            }
        while(set.contains(maxseq))
        {
            maxseq++;
        }
        return maxseq;
           }
}