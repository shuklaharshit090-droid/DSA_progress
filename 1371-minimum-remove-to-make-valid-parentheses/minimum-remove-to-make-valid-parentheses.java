class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=')'){
                if(s.charAt(i)=='('){
                    st.push(s.charAt(i));
                    count++;
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else{
                if(count>=1){
                st.push(')');
                count--;
            }
            }
        }
        while(count>0)
        {
            st.remove(st.lastIndexOf('('));
            count--;
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}