class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int ans=0;
        while(l<r)
        {
            int min=Math.min(height[l],height[r]);
            int water=r-l;
            ans=Math.max(min*water,ans);
            if(height[l]>=height[r])
            {
                r--;
            }
            else{
                l++;
            }
        }
        return ans;
    }
}