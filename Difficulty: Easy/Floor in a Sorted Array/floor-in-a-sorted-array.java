class Solution {
    static int findFloor(int[] arr, int x) {
        int pos=-1;
        if(arr[arr.length-1]<x) return arr.length-1;
        int l=0;
        int h=arr.length-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(arr[mid]<=x)
            {
                pos=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return pos;
    }
}
