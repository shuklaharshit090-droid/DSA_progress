class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        boolean visited[][]=new boolean[row][col];
        int r=0;
        int c=0;
        visited[r][c]=true;
         while(true){
              if(grid[r][c]=='L')
              {
                if(c-1>=0 && visited[r][c-1]!=true)
                {
                    c--;
                }
                else{
                    int arr[]=new int[2];
                    arr[0]=r;
                    arr[1]=c;
                    return arr;
                }
              }
              else if(grid[r][c]=='R')
              {
                if(c+1<=col-1 && visited[r][c+1]!=true)
                {
                    c++;
                }
                else{
                    int arr[]=new int[2];
                    arr[0]=r;
                    arr[1]=c;
                    return arr;
                }
              }
               else if(grid[r][c]=='U')
              {
                if(r-1>=0 && visited[r-1][c]!=true)
                {
                    r--;
                }
                else{
                    int arr[]=new int[2];
                    arr[0]=r;
                    arr[1]=c;
                    return arr;
                }
              }
              else{
                if(r+1<=row-1 && visited[r+1][c]!=true)
                {
                    r++;
                }
                else{
                    int arr[]=new int[2];
                    arr[0]=r;
                    arr[1]=c;
                    return arr;
                }
              }
              visited[r][c]=true;
            }
        
        // int arr[]=new int[2];
        // arr[0]=r;
        // arr[1]=c;
        // return arr;
    }
}