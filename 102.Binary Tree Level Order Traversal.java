I use BFS with a queue.

I process the tree level by level.
For each level, I get the size of the queue
and process all nodes in that level.

I add their values to a list
and push their children into the queue.

At the end, I return all levels.

Time is O(n), space is O(n).
    
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        //创建双list而不是双数组，因为子数组大小不能固定
        List<List<Integer>> res = new ArrayList<>();
        
        //判断是否没有root
        if(root==null) return res;

        //创建一个先进先出的队列，存放树 的节点
        Queue<TreeNode> queue = new LinkedList<>();
        //将头节点放入队列
        queue.offer(root);

        //递归到queue中没有节点（空了）
        while(!queue.isEmpty()){
            //算出本层有多少节点，决定循环了多少词
            int size=queue.size();
            //创建子list。存放本层所有数值
            List<Integer> lea = new ArrayList<>();

            //循环本层节点数量次
            for(int i=0;i<size;i++){
                //创建一个节点类存放当前节点
                TreeNode te=new TreeNode();
                te=queue.poll();
                //将本节点加入lea
                lea.add(te.val);

                //判断本节点是否有左右孩子
                //如果有从左至右存入--<先进先出>--的队列中
                //一遍循环至下一层从左至右遍历
                if(te.left!=null){
                    queue.offer(te.left);
                }
                if(te.right!=null){
                    queue.offer(te.right);
                }
            }

            //将本层存入结果
            res.add(lea);
        }
        return res;
    }
}
