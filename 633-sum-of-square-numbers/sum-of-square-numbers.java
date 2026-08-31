class Solution {
    public boolean judgeSquareSum(int c) {
        //if(c==0) return false;
        double l=0;
        double r=(int)Math.sqrt(c);
        while(l<=r)
        {
            double v=l*l+r*r;
            if(v==c)
            {
                return true;
            }
            if(v>c)
            {
                r--;
            }
            else{
                l++;
            }
        }
        return false;
    }
}