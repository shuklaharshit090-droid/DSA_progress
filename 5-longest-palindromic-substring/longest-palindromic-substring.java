class Solution {
    public boolean isPalin(String s)
    {
        for(int x=0;x<s.length()/2;x++)
        {
            if(s.charAt(x)!=s.charAt(s.length()-1-x))
            return false;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int l=0,r=s.length()-1;
        String st=s.charAt(0)+"",w="";
        int stl=0;
        char c1,c2;
        for(int x=0;x<s.length();x++)
        {
            l=x;
            r=s.length()-1;
            while(l<r)
            {
                w=s.substring(l,r+1);
                c1=s.charAt(l);
                c2=s.charAt(r);
                
                if(c1==c2 &&w.length()>stl && isPalin(w))
                {
                    st=w;
                    stl=st.length();
                }
                else
                r--;
            }
        }
        return st;
    }
}