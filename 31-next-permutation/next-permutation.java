class Solution {
    public void reverse(int[] nums)
    {
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(nums);
            return;
        }
            int pivot1=nums.length-1;
            while(pivot1>pivot)
            {
                if(nums[pivot1]>nums[pivot]){
                   break;
                }
                pivot1--;
            }
            int temp=nums[pivot];
            nums[pivot]=nums[pivot1];
            nums[pivot1]=temp;
            int i=pivot+1;
            int j=nums.length-1;
            while(i<j)
            {
                int temp1=nums[i];
                nums[i]=nums[j];
                nums[j]=temp1;
                i++;
                j--;
            }

    }
}