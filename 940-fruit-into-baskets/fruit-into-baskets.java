class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0;
        int r=0;
        int num1=-1;
        int num2=-1;
        int freq[]=new int[2];
        int maxfruit=-1;
        int last=-1;
        int laststart=0;
        while(r<n)
        {
            if(freq[0]==0) {
                freq[0]++;
                num1=fruits[r];
            }
            else if(freq[1]==0 && fruits[r]!=num1)
            {
                freq[1]++;
                num2=fruits[r];
            }
            else if(fruits[r]==num1 || fruits[r]==num2)
            {
                if(fruits[r]==num1) freq[0]++;
                else freq[1]++;
            }
            else{
                maxfruit=Math.max(r-l,maxfruit);
                l=laststart;
                if(last==num1)
                {
                    freq[1]=1;
                    freq[0]=r-l;
                    num2=fruits[r];
                }
                else{
                    freq[0]=1;
                    freq[1]=r-l;
                    num1=fruits[r];
                }
                }
                 if(last!=fruits[r]){
                    last=fruits[r];
                    laststart=r;
            }
            r++;
        }
        maxfruit=Math.max(freq[0]+freq[1],maxfruit);
        return maxfruit;
    }
}