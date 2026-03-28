//1) DFS 在做什么（直观理解）
//把“岛屿”想成一坨连通的 '1'（只算上下左右连通，不算斜着）。
//外层双循环扫地图
//一旦发现 '1'：
//岛屿数量 count++
//立刻 DFS 把这坨岛屿的所有 '1' 全部标记为访问过（常用做法：直接改成 '0'）
//继续扫，后面再遇到的同一座岛的 '1' 已经被改成 '0'，不会重复计数

I use DFS to solve this problem.

I go through the grid,
and whenever I find a land cell,
I increase the count and run DFS.

In DFS, I mark all connected land as visited
by turning them into water.

This way, each island is counted only once.

Time is O(mn), space is O(mn).

class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length,n=grid[0].length;
        int count=0;
        //遍历所有元素，发现1调用dfs
        //调用dfs的目的是把所有相连的1全部变为0
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid,int r,int c){
        int m=grid.length,n=grid[0].length;
        //判断如果数组越界或者已经为0则执行下面
        if(r<0||r>=m||c<0||c>=n|| grid[r][c] == '0'){
            return;
        }

        // 标记访问：把陆地改成水，避免重复
        grid[r][c]='0';
        
        // 扩散到四周
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

}
