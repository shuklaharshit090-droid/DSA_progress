class Solution {
    public String reverseWords(String s) {
        s=" "+s+" ";
        StringBuilder ans=new StringBuilder();
        int idx=s.length();
        int i=s.length()-1;
        while(i>=0)
        {
            if(s.charAt(i)==' ')
            {
                if(idx>i+1){
                ans.append(s.substring(i+1,idx));
                ans.append(" ");
                }
                while(i>=0 && s.charAt(i)==' ')
                {
                    i--;
                }
                idx=i+1;
            }
            else{
            i--;
            }
        }
        String a=ans.toString();
        a=a.trim();
        return a;
    }
}