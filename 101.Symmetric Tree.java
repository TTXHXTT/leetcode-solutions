class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode left, TreeNode right) {
        
        // 情况1：都为空
        if (left == null && right == null) {
            return true;
        }
        
        // 情况2：一个为空
        if (left == null || right == null) {
            return false;
        }
        
        // 情况3：值不同
        if (left.val != right.val) {
            return false;
        }
        
        // 情况4：递归判断镜像位置
        return isMirror(left.left, right.right)
            && isMirror(left.right, right.left);
    }
}
