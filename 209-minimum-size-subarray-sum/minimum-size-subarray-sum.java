class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0;
        int mindigit=Integer.MAX_VALUE;
        int len=0;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
         sum+=nums[i];
         len++;   
         while(target<=sum)
         {
            mindigit=Math.min(mindigit,len);
            sum=sum-nums[k];
            k++;
            len--;
         }
            }
         return (mindigit==Integer.MAX_VALUE)?0:mindigit;
        }
    }
