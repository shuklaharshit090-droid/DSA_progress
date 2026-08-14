class Solution {
    public boolean backspaceCompare(String s, String t) {
        String temp1="";
        String temp2="";
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty())
        {
            temp1=st.peek()+temp1;
            st.pop();
        }
        st=new Stack<>();
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)=='#')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else{
                st.push(t.charAt(i));
            }
        }
        while(!st.isEmpty())
        {
            temp2=st.peek()+temp2;
            st.pop();
        }
        return temp1.equals(temp2);
    }
}