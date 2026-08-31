class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            st.push(s.charAt(i));
            if(st.size()>=3 && st.peek()=='c')
            {
                char c1=st.pop();
                char b1=st.pop();
                char a1=st.pop();
                if(c1!='c' || b1!='b' || a1!='a')
                {
                   return false;
                }
            }
        }
        return st.isEmpty();
    }
}