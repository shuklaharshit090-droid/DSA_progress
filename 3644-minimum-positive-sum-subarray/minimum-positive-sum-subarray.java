class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=nums.get(i);
             if(1>=l && 1<=r && sum>0){
                    min=Math.min(sum,min);
                }
            for(int j=i+1;j<n;j++)
            {
                // if(j-i>=l && j-i<=r && sum>0){
                //     min=Math.min(sum,min);
                // }
                sum+=nums.get(j);
                if(j-i+1>=l && j-i+1<=r && sum>0){
                    min=Math.min(min,sum);
                }
            }
        }
        return (min==Integer.MAX_VALUE)?-1:min;
    }
}