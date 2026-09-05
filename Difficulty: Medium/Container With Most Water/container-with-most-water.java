class Solution {
    public int maxWater(int arr[]) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        int maxheight=0;
        while(i<j)
        {
            int width=j-i;
            int height=Math.min(arr[j],arr[i]);
            maxheight=Math.max(width*height,maxheight);
            if(arr[i]<=arr[j]) i++;
            else j--;
        }
        return maxheight;
    }
}