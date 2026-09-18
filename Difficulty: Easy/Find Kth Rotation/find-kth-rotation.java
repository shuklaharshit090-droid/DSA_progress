class Solution {
    public int findKRotation(int arr[]) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==min) return i;
        }
        return 0;
    }
}