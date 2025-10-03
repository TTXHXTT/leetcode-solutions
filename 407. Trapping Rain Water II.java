/*407. Trapping Rain Water II
407. 排水沟 II
Solved
  已解决
Hard
  困难
Topics
  主题
premium lock icon
Companies  公司
Given an m x n integer matrix heightMap representing the height of each unit cell in a 2D elevation map, return the volume of water it can trap after raining.
给定一个 m x n 整数矩阵 heightMap 表示二维海拔图中每个单元的高度，返回下雨后它能接住的雨水量。

 

Example 1:  示例 1：


Input: heightMap = [[1,4,3,1,3,2],[3,2,1,3,2,4],[2,3,3,2,3,1]]
Output: 4
Explanation: After the rain, water is trapped between the blocks.
We have two small ponds 1 and 3 units trapped.
The total volume of water trapped is 4.
Example 2:  示例 2：


Input: heightMap = [[3,3,3,3,3],[3,2,2,2,3],[3,2,1,2,3],[3,2,2,2,3],[3,3,3,3,3]]
Output: 10
 

Constraints:  约束条件：

m == heightMap.length
n == heightMap[i].length
1 <= m, n <= 200
0 <= heightMap[i][j] <= 2 * 104*/

import java.util.*;

class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length , n = heightMap[0].length;
        if (m<3||n<3){return 0;}

        boolean [][] visit = new boolean[m][n];
        // 小根堆：按高度排序
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        // int[] = {高度, x, y}

        
        // 1. 边界入堆
        //最左侧、右侧列入堆
        for(int i=0 ; i<m ; i++){
            pq.offer(new int[]{heightMap[i][0] , i , 0 });
            pq.offer(new int[]{heightMap[i][n-1] , i , n-1 });
            visit[i][0] = true;
            visit[i][n - 1] = true;
        }

        //最上、下行入堆
        for(int i=1 ; i<n-1 ; i++){
            pq.offer(new int[]{heightMap[0][i] , 0 , i });
            pq.offer(new int[]{heightMap[m-1][i] , m-1 , i });
            visit[0][i] = true;
            visit[m - 1][i] = true;
        }

        int res  = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        //2.开始从最矮的出堆
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int h = cur[0] , x = cur[1] , y = cur[2];

            for(int[] d :dirs){
                int nx =  x+d[0] , ny = y+d[1];
                if(nx<0||ny<0||nx>=m||ny>=n||visit[nx][ny]) continue;

                visit[nx][ny] = true;
                int nh = heightMap[nx][ny];
                if(nh<h){
                    res += h - nh;
                }
                pq.offer(new int[]{Math.max(nh,h),nx,ny});
            }

        
        }
        return res;
    }




    
} 
