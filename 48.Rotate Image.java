class Solution {
    public void rotate(int[][] matrix) {

I solve this in two steps.

First, I transpose the matrix,
which means swapping matrix[i][j] and matrix[j][i].

Then I reverse each row.

These two steps together rotate the matrix 90 degrees clockwise.

Time is O(n²), and space is O(1).
        
        int n=matrix.length;
        /* 
         * 第一步：沿主对角线进行转置
         * 作用：把 matrix[i][j] 和 matrix[j][i] 交换
         * 注意：j 从 i+1 开始，避免重复交换和交换自己
         */
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]= temp;
            }
        }

        /*
         * 第二步：对每一行进行左右翻转
         * 作用：完成顺时针 90° 旋转
         */
        for(int i=0;i<n;i++){
            
            int right=n-1,left=0;
             // 双指针向中间收缩，交换左右元素
            while(right>left){
                int temp = matrix[i][right];
                matrix[i][right]=matrix[i][left];
                matrix[i][left]= temp;
                right--;
                left++;
            }
        }
    }
}
