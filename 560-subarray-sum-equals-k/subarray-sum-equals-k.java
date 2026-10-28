class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int prefixsum=0;
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            prefixsum+=nums[i];
            if(prefixsum==k) result++;
            result+=map.getOrDefault(prefixsum-k,0);
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return result;
    }
}