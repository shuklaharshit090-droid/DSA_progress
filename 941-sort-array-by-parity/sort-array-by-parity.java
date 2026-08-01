class Solution {
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int[] sortArrayByParity(int[] nums) {
       int i=0;
       int h=nums.length-1;
       while(i<h)
       {
        if(nums[i]%2!=0 && nums[h]%2==0)
        {
            swap(nums,i,h);
            i++;
            h--;
        }
        if(nums[i]%2==0 && nums[h]%2==0)
        {
            i++;
        }
        if(nums[i]%2==0 && nums[h]%2!=0)
        {
            i++;
            h--;
        }
        if(nums[i]%2!=0 && nums[h]%2!=0)
        {
            h--;
        }
       } 
       return nums;
    }
}