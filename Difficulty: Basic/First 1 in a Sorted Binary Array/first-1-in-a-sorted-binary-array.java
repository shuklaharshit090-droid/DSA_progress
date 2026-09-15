class Solution {
    public int firstIndex(int arr[]) {
         int n=arr.length;
         int l=0;
         int h=n-1;
         int ans=-1;
         while(l<=h)
         {
             int mid=(l+h)/2;
             if(arr[mid]>=1)
             {
                 ans=mid;
                 h=mid-1;
             }
             else{
                 l=mid+1;
             }
         }
         return ans;
    }
}