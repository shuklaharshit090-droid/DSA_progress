class Solution {
    public void dfs(int[][] image,int i,int j,int color,int oldcolor)
    {
        if(i<0||j<0||i>=image.length||j>=image[0].length||image[i][j]!=oldcolor){
            return;
        }
        if(image[i][j]==color) return;
        image[i][j]=color;
        dfs(image,i+1,j,color,oldcolor); 
        dfs(image,i-1,j,color,oldcolor);
        dfs(image,i,j-1,color,oldcolor);
        dfs(image,i,j+1,color,oldcolor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor=image[sr][sc];
        if(oldcolor==color) return image;
        dfs(image,sr,sc,color,oldcolor);
        return image;
    }
}