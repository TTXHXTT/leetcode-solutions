class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

I use four pointers to represent the current boundaries.

In each step, I traverse the top row,
the right column,
the bottom row,
and the left column.

After each step, I shrink the boundaries.

I also check the boundaries
to avoid duplicate traversal.

Time is O(mn), space is O(1).
        
        List<Integer> res = new ArrayList<>();
        
        //空矩阵直接返回空
        if(matrix==null||matrix.length==0) return res;
        
        //定义每一圈的四个边界
        int top=0;
        int left=0;
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;

        //必须行和列全部存在才叫圈
        while(top<=bottom&&right>=left){

            // ① 从左到右，遍历 top 行
            for(int j=left;j<=right;j++){
                res.add(matrix[top][j]);
            }
            top++;// top 行已经遍历完，向下收缩

            // ② 从上到下，遍历 right 列
            for(int i=top;i<=bottom;i++){
                res.add(matrix[i][right]);
            }
            right--;// right 列已经遍历完，向左收缩

            // ③ 从右到左，遍历 bottom 行
            // 必须判断，防止只剩一行时重复遍历（上面①已经遍历过）
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    res.add(matrix[bottom][j]);
                }
                bottom--;// bottom 行遍历完，向上收缩
            }

            // ④ 从下到上，遍历 left 列
            // 必须判断，防止只剩一列时重复遍历
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;// left 列遍历完，向右收缩
            }
        }
        return res;
    }

}
