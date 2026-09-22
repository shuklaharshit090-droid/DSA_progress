class Solution {
    public double destination(long a,int[] dist){
        double destinationtime=0.0;
        for(int i=0;i<dist.length-1;i++){
            destinationtime+=Math.ceil((double)dist[i]/a);
        }
        destinationtime+=(double)dist[dist.length-1]/a;
        return destinationtime;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<dist.length;i++){
            max=Math.max(max,dist[i]);
        }
        long l=1;
        long h=10000000;
        long ans=-1;
        while(l<=h){
            long mid=(l+h)/2;
            if(destination(mid,dist)<=hour)
            {
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