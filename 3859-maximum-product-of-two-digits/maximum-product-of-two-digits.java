class Solution {
    public int maxProduct(int n) {
     int temp=n;
     int count=0;
     while(temp!=0)
     {
        temp=temp/10;
        count++;
     }
     int arr[]=new int[count];
     for(int i=count-1;i>=0;i--)
     {
        arr[i]=n%10;
        n=n/10;
     }
     int maxprod=0;
     for(int i=0;i<count;i++)
     {
        for(int j=0;j<count;j++)
        {
            if(i!=j)
            {
                int prod=arr[i]*arr[j];
                maxprod=Math.max(prod,maxprod);
            }
        }
     }
     return maxprod;
    }
}