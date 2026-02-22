class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        // 情况1：都为空 -> 相同
        if (p == null && q == null) {
            return true;
        }
        
        // 情况2：一个为空，一个不为空 -> 不相同
        if (p == null || q == null) {
            return false;
        }
        
        // 情况3：当前节点值不同 -> 不相同
        if (p.val != q.val) {
            return false;
        }
        
        // 情况4：当前节点值相同，递归比较左右子树
        return isSameTree(p.left, q.left) 
            && isSameTree(p.right, q.right);
    }
}
