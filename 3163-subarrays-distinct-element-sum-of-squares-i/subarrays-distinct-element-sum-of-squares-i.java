class Solution {
    public int sumCounts(List<Integer> nums) {
        ArrayList<Integer>size=new ArrayList<>();
        for(int i=0;i<nums.size()-1;i++)
        {
            HashSet<Integer>set=new HashSet<>();
            for(int j=i;j<nums.size();j++)
            {
                set.add(nums.get(j));
                size.add(set.size());
            }
        }
        int ans=0;
        for(int i:size)
        {
            ans+=Math.pow(i,2);
        }
        return ans+1;
    }
}