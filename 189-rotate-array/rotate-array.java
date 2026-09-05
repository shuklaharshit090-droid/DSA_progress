class Solution {
    public void reverse(int nums[],int i,int k)
    {
        int l=i;
        int h=k;
        while(l<h)
        {
            int temp=nums[l];
            nums[l]=nums[h];
            nums[h]=temp;
            l++;
            h--;
        }
    }
    public void rotate(int[] nums, int k) {
        // int i=0;
        int n=nums.length;
        k=k%n;
        if(n==1) return;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
}