class Solution {
    public int myAtoi(String s) {
        long ans=0;
        s=s.trim();
        if(s.length()==0) return 0;
        int i=0;
        int sign=1;
        if(s.charAt(i)=='-'){
          sign=-1;
          i++;
        }
        else if(s.charAt(i)=='+')
        {
            i++;
        }
        // while(i<s.length())
        // {
        //     int freq=s.charAt(i);
        //     if(freq<48 && freq>57){
        //         break;
        //     }
        //     while(i<s.length() && (freq==48)){
        //         i++;
        //     }
        //    break;
        // }
        while(i<s.length()){
            int freq=s.charAt(i);
            if(freq<48 || freq>57)
            {
                break;
            }
            ans=ans*10+(freq-'0');
            i++;
            if (sign == -1 && ans > 2147483648L)
            {
                return Integer.MIN_VALUE;
            }
            else if(sign==1 && ans>Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
        }
        return (int)ans*sign;
    }
}