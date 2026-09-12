class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=0;
        int freq[]=new int[10001];
        int sum=0;
        int maxsum=0;
        while(r<n){
            if(freq[nums[r]]==0)
            {
                sum+=nums[r];
                freq[nums[r]]++;
            }
            else{
                maxsum=Math.max(maxsum,sum);
                while(freq[nums[r]]!=0)
                {
                    freq[nums[l]]--;
                    sum-=nums[l];
                    l++;
                }
                sum+=nums[r];
                freq[nums[r]]++;
            }
            r++;
        }
        maxsum=Math.max(maxsum,sum);
        return maxsum;
    }
}