class Solution {
    public long magic(long a,int arr[])
    {
        long count=0;
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
    public int findPages(int[] arr, int k) {
        if(k>arr.length) return -1;
        int start=Integer.MIN_VALUE;
        long sum=0;
        for(int i=0;i<arr.length;i++)
        {
            start=Math.max(start,arr[i]);
            sum+=arr[i];
        }
        int ans=-1;
        long l=start;
        long h=sum;
        while(l<=h){
            long mid=l+(h-l)/2;
            if(magic(mid,arr)<=k)
            {
                ans=(int)mid;
                h=mid-1;
            }
            else{
            l=mid+1;
            }
        }
        return (int)ans;
    }
}