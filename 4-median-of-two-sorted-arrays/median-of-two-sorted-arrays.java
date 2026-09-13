class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int[m+n];
        int r=0;
        double ans=0.00000;
        for(int i=0;i<m;i++)
        {
            arr[r++]=nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[r++]=nums2[i];
        }
        Arrays.sort(arr);
        if((m+n)%2==0)
        {
            ans=(arr[(m+n)/2]+arr[((m+n-1)/2)])/2.00000;
        }
        else
        {
            ans=arr[(m+n)/2];
        }
        return ans;
    }
}