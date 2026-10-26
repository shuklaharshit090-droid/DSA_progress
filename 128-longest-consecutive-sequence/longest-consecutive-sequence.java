class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int longest=0;
        for(int i:set)
        {
            if(i==Integer.MIN_VALUE || !set.contains(i-1)){
                int curr=i;
                int count=1;
                while(curr!=Integer.MAX_VALUE && set.contains(curr+1))
                {
                    count++;
                    curr++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}