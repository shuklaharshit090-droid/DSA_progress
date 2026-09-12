class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int maxcount=-1;
        int l=0;
        int r=0;
        int arr[]=new int[2];
        while(r<n){
            if(nums[r]==1) arr[1]++;
            else if(nums[r]==0 && arr[0]<k)
            {
                arr[0]++;
            }
            else if(nums[r]==0 && arr[0]==k)
            {
                maxcount=Math.max(maxcount,r-l);
                while(arr[0]!=k-1)
                {
                    if(nums[l]==1) arr[1]--;
                    else arr[0]--;
                    l++;
                }
                arr[0]++;
            }
            r++;
        }
        maxcount=Math.max(maxcount,r-l);
        return maxcount;
    }
}