class Solution {
    public void dfs(char[][]board,int nr,int nc,int vis[][])
    {
        if(nr<0 || nc<0 || nr>= board.length|| nc>=board[0].length || vis[nr][nc]==1 || board[nr][nc]=='X')
        {
            return;
        }
        vis[nr][nc]=1;
        dfs(board,nr+1,nc,vis);
        dfs(board,nr-1,nc,vis);
        dfs(board,nr,nc+1,vis);
        dfs(board,nr,nc-1,vis);
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int vis[][]=new int[m][n];
        int i=0;
        for(int j=0;j<n;j++)
        {
            if(board[i][j]=='O'){
                dfs(board,i,j,vis);
            }
        }
        i=m-1;
        for(int j=0;j<n;j++)
        {
            if(board[i][j]=='O'){
                dfs(board,i,j,vis);
            }
        }
        int y=0;
        for(int x=0;x<m;x++)
        {
            if(board[x][y]=='O')
            {
                dfs(board,x,y,vis);
            }
        }
        y=n-1;
        for(int x=0;x<m;x++){
            if(board[x][y]=='O')
            {
                dfs(board,x,y,vis);
            }
        }
        for(i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='O' && vis[i][j]==0)
                {
                    board[i][j]='X';
                }
            }
        }

        }

    }
