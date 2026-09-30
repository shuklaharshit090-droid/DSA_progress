class Solution {
    public int[] maxDepthAfterSplit(String seq) {

        int ans[] = new int[seq.length()];
        Stack<Character> st = new Stack<>();

        int count = 0;

        ArrayList<Integer> occurence = new ArrayList<>();

        for(int i = 0; i < seq.length(); i++)
        {
            if(seq.charAt(i) == '(')
            {
                st.push('(');

                if(st.size() == 1)
                {
                    count = 0;
                }
                else
                {
                    count ^= 1;
                }

                occurence.add(i);
            }
            else
            {
                ans[i] = count;

                ans[occurence.get(occurence.size()-1)] = count;

                occurence.remove(occurence.size()-1);

                st.pop();

                if(st.size() != 0)
                    count ^= 1;
            }
        }

        return ans;
    }
}