class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int maxcount=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                count++;
                maxcount=Math.max(count,maxcount);
            }
            else if(s.charAt(i)==')')
            {
                count--;
            }
        }
        return maxcount;
    }
}