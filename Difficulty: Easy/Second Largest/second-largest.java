class Solution {
    public int getSecondLargest(int[] arr) {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
         max=Math.max(max,arr[i]);
        }
        int largemax=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<max)
            {
                largemax=Math.max(arr[i],largemax);
            }
        }
        return (largemax==0)?-1:largemax;
    }
}