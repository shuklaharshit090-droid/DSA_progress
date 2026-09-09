class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int l=0;
        int r=0;
        while(r<nums.length)
        {
            if(!map.containsKey(nums[r]))
            {
                map.put(nums[r],1);
            }
            else{
                map.put(nums[r],map.get(nums[r])+1);
            }
            while(map.size()==set.size())
            {
                ans=ans+nums.length-r;
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0) map.remove(nums[l]);
                l++;
            }
            r++;
        }
        return ans;
    }
}