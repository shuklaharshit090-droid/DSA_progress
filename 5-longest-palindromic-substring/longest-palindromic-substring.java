class Solution {
    public String longestPalindrome(String s) {
      int n=s.length();
      if(s.length()<=1) return s;
      String ans="";
      for(int i=1;i<n;i++)
      {
        int low=i;
        int high=i;
        while(low>=0 && high<n && s.charAt(low)==s.charAt(high)){
            low--;
            high++;
        }
        String palin=s.substring(low+1,high);
        if(ans.length()<palin.length())
        {
            ans=palin;
        }
        low=i-1;
        high=i;
        while(low>=0 && high<n && s.charAt(low)==s.charAt(high))
        {
            low--;
            high++;
        }
        String palin2=s.substring(low+1,high);
        if(ans.length()<palin2.length())
        {
            ans=palin2;
        }
      }  
      return ans;
    }
}