class Solution {
    public int delivery(int a,int arr[]){
        int time=a;
        int count=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]<=time){
              time-=arr[i];
              i++;
            }
            else{
                count++;
                time=a;
            }
        }
        count++;
        return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int start=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            start=Math.max(start,weights[i]);
            sum+=weights[i];
        }
        int ans=-1;
        int l=start;
        int h=sum;
        while(l<=h){
            int mid=(l+h)/2;
            if(delivery(mid,weights)<=days){
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