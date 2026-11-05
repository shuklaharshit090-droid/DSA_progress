class Solution {
    public String removeStars(String s) {
        if(s.length()==0) return s;
        if(s.length()==1 && s.charAt(0)=='*') return s;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String ans="";
        while(!st.isEmpty())
        {
          ans=st.pop()+ans;
        }
        return ans;
    }
}