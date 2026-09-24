class Solution {
    public long magic(long a,int arr[]){
        int count=0;
        long capacity=a;
        int i=0;
        while(i<arr.length){
            if(arr[i]<=capacity){
                capacity-=arr[i];
                i++;
            }
            else{
                count++;
                capacity=a;
            }
        }
        count++;
        return count;
    }
    public int minTime(int[] arr, int k) {
        int n=arr.length;
        int start=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            start=Math.max(start,arr[i]);
            sum+=arr[i];
        }
        long ans=-1;
        long l=start;
        long h=sum;
        while(l<=h){
            long mid=(l+h)/2;
            if(magic(mid,arr)<=k){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return (int)ans;
    }
}
