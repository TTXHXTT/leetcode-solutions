/*417. Pacific Atlantic Water Flow
417. 太平洋大西洋水流问题
Solved
  已解决
Medium
  中等
Topics
  主题
premium lock icon
Companies  公司
There is an m x n rectangular island that borders both the Pacific Ocean and Atlantic Ocean. The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches the island's right and bottom edges.
有一个 m x n 矩形岛屿，它同时与太平洋和大西洋接壤。太平洋接触岛屿的左边缘和上边缘，大西洋接触岛屿的右边缘和下边缘。

The island is partitioned into a grid of square cells. You are given an m x n integer matrix heights where heights[r][c] represents the height above sea level of the cell at coordinate (r, c).
岛屿被划分为一个由正方形单元格组成的网格。你给出一个 m x n 整数矩阵 heights ，其中 heights[r][c] 表示坐标 (r, c) 处单元格的海拔高度。

The island receives a lot of rain, and the rain water can flow to neighboring cells directly north, south, east, and west if the neighboring cell's height is less than or equal to the current cell's height. Water can flow from any cell adjacent to an ocean into the ocean.
岛屿降雨量很大，雨水可以直接流向相邻的单元格（北、南、东、西），如果相邻单元格的高度小于或等于当前单元格的高度。水可以从任何与海洋相邻的单元格流入海洋。

Return a 2D list of grid coordinates result where result[i] = [ri, ci] denotes that rain water can flow from cell (ri, ci) to both the Pacific and Atlantic oceans.
返回一个二维列表 result ，其中 result[i] = [ri, ci] 表示雨水可以从单元格 (ri, ci) 流入太平洋和大西洋。

 

Example 1:  示例 1：


Input: heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
Explanation: The following cells can flow to the Pacific and Atlantic oceans, as shown below:
[0,4]: [0,4] -> Pacific Ocean 
       [0,4] -> Atlantic Ocean
[1,3]: [1,3] -> [0,3] -> Pacific Ocean 
       [1,3] -> [1,4] -> Atlantic Ocean
[1,4]: [1,4] -> [1,3] -> [0,3] -> Pacific Ocean 
       [1,4] -> Atlantic Ocean
[2,2]: [2,2] -> [1,2] -> [0,2] -> Pacific Ocean 
       [2,2] -> [2,3] -> [2,4] -> Atlantic Ocean
[3,0]: [3,0] -> Pacific Ocean 
       [3,0] -> [4,0] -> Atlantic Ocean
[3,1]: [3,1] -> [3,0] -> Pacific Ocean 
       [3,1] -> [4,1] -> Atlantic Ocean
[4,0]: [4,0] -> Pacific Ocean 
       [4,0] -> Atlantic Ocean
Note that there are other possible paths for these cells to flow to the Pacific and Atlantic oceans.*/


class Solution {
    private int m, n;
    private int[][] heights;
    private boolean[][] pacific, atlantic;
    private final int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        this.heights = heights;


        m = heights.length;
        n = heights[0].length;

        pacific = new boolean[m][n];
        atlantic = new boolean[m][n];

        //从太平洋边界开始进行扫描
        for(int i = 0;i<m;i++){
            dfs(i,0,pacific);
            dfs(i,n-1,atlantic);
        }
        for(int i=0 ; i<n ; i++){
            dfs(0, i, pacific);       // 上边
            dfs(m - 1, i, atlantic); 
        }

        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(pacific[i][j]&&atlantic[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }

        return res;


    }

    public void dfs(int r,int c,boolean[][] visited){
        visited[r][c] = true;
        for(int[] dir : dirs){
            int nr = r + dir[0] , nc = c + dir[1];
            if(nr < 0 || nr>= m ||nc<0 ||nc>=n) continue;

            //如果下一个格子更高且没访问过，可以逆流过去

            if(!visited[nr][nc] && heights[nr][nc] >= heights[r][c]){
                dfs(nr,nc,visited);
            }
        }
    }
}

