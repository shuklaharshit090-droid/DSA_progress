class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int flag=0;
        int stone=10;
        while(n!=0 && stone<=n){
            n=n-stone;
            stone--;
            flag^=1;
        }
        // if(n==0) return false;
        return (flag==0)?false:true;
    }
}