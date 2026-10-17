class Solution {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
       String s1="";
       for(int i=0;i<s.length();i++)
       {
         int freq=(int) s.charAt(i);
         if(freq>=97 && freq<=122 || (freq>=48 && freq<=57))
         {
            s1+=s.charAt(i);
         }
       }
       String s2="";
       for(int i=0;i<s1.length();i++)
       {
        s2=s1.charAt(i)+s2;
       }
       return s1.equals(s2);
    }
}