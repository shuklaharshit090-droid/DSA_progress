class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int result=0;
        int maxlength=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) nums[i]=-1;
        }
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
            else{
                int currentlength=i-map.get(sum);
                maxlength=Math.max(maxlength,currentlength);
            }
        }
        return maxlength;
    }
}