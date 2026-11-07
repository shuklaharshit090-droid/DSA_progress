class Solution {
    public int countElements(int[] nums) {
        if(nums.length==0) return 0;
      Arrays.sort(nums);
      int count=0;
      HashSet<Integer>set=new HashSet<>();
      int first=nums[0];
      int last=nums[nums.length-1];
      for(int i=1;i<nums.length-1;i++)
      {
        if(nums[i]!=first && nums[i]!=last)
        set.add(nums[i]);
      }
      for(int i=1;i<nums.length-1;i++)
      {
        if(set.contains(nums[i])) count++;
      }
      return count; 
    }
}