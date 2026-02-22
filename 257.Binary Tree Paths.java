class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        
        dfs(root, "", result);
        return result;
    }
    
    private void dfs(TreeNode node, String path, List<String> result) {
        
        if (node == null) return;
        
        // 当前节点加入路径
        path += node.val;
        
        // 如果是叶子节点
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }
        
        // 不是叶子节点，加 ->
        path += "->";
        
        dfs(node.left, path, result);
        dfs(node.right, path, result);
    }
}
