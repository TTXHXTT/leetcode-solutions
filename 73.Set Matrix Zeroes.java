class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        //用来判断原始数据第一行和第一列是否有0
        boolean firstRow = false;
        boolean firstCol = false;
        // 1) 先检查第一行是否需要清零
        for(int i=0;i<n;i++){
            if(matrix[0][i]==0){
                firstRow = true;
                break;
            }
        }
        // 2) 再检查第一列是否需要清零    
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstCol = true;
                break;
            }
        }
        // 3) 用第一行/第一列做标记：从 (1,1) 开始，避免影响 firstRow/firstCol 的判断
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;

                }
            }
        }
        // 4) 根据标记，把内部 (1..m-1, 1..n-1) 清零
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        // 5) 最后处理第一行
        if(firstRow){
            for (int j = 0; j < n; j++) matrix[0][j] = 0;
        }

        // 6) 最后处理第一列
        if (firstCol) {
            for (int i = 0; i < m; i++) matrix[i][0] = 0;
        }
    }
}
