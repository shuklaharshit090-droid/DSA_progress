class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=height.length-1;
        int ans=0;
        while(l<r)
        {
            int min=Math.min(height[l],height[r]);
            int water=r-l;
            ans=Math.max(ans,min*water);
            if(height[l]<=height[r])
            {
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
}