class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int arr[]=new int[nums.length];
        HashSet<Integer>set=new HashSet<>();
        int k=0;
        for(int i=nums.length-1;i>=0;i--)
        {
          arr[k++]=nums[i];
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
          if(!set.contains(arr[i])){
            set.add(arr[i]);
            count++;
            if(count==3) return arr[i];
          }
        }
        return arr[0];
    }
}