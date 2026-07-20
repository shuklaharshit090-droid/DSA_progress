class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r=grid.length;
        int c=grid[0].length;
        k=k%(r*c);
        for(int i=1;i<=k;i++)
        {
            int curr=grid[0][0];
            int prev=grid[0][0];
            for(int l=0;l<r;l++)
            {
                for(int f=0;f<c;f++)
                {
                    prev=curr;
                    curr=grid[l][f];
                    grid[l][f]=prev;
                }
            }
            grid[0][0]=curr;
        }
         List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<r;i++)
        {
            List<Integer> a=new ArrayList<>();
            for(int j=0;j<c;j++)
            {
                a.add(grid[i][j]);
            }
            ans.add(a);
        }
        return ans;
    }
}