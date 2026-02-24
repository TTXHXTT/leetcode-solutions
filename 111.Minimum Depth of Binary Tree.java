class Solution {
    public int minDepth(TreeNode root) {

        // 1️⃣ 如果整棵树为空
        // 空树的最小深度是 0
        if (root == null) return 0;

        // 2️⃣ 如果左子树为空
        // 说明最短路径一定在右子树
        // 不能取 min(left, right)，
        // 因为 left 是 0，会被错误选中
        if (root.left == null)
            return 1 + minDepth(root.right);

        // 3️⃣ 如果右子树为空
        // 同理，最短路径只能在左子树
        if (root.right == null)
            return 1 + minDepth(root.left);

        // 4️⃣ 如果左右子树都存在
        // 才可以取左右子树最小值
        // 当前节点算一层，所以 +1
        return 1 + Math.min(minDepth(root.left),
                            minDepth(root.right));
    }
}
