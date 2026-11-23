class Solution {
    public boolean checkString(String s) {
        if(s.length()==0) return true;
        if(s.length()==1 && s.charAt(0)=='b') return true;
        if(s.length()==1 && s.charAt(0)=='a') return true;
        int indexOfB=-1;

        indexOfB=s.indexOf('b');
        if(indexOfB==-1) return true;
        if(s.length()==1 && indexOfB==0) return true;
        for(int i=indexOfB;i<s.length();i++)
        {
            if(s.charAt(i)=='a') return false;
        }
        return true;

    }
}