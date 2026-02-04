class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //创建存放答案数组
        int[] res = new int[nums.length-k+1];

        //创建双端队列,其中只存入题目数组的下标
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0;i<nums.length;i++){
            //定义窗口最左侧下标
            int  left = i-k+1;
            //判断双端队列头元素是否超出窗口左侧，超出则删除
            if(!deque.isEmpty()&&deque.peekFirst()<left){
                deque.pollFirst();
            }
            //循环对比从右至左（从小到大）
            while(!deque.isEmpty()&&nums[deque.peekLast()]<=nums[i]){
                deque.pollLast();
            }
            //经过上两步的清理，可以直接将当前值放入
            deque.offerLast(i);
            //从第一个完整窗口出现时，向结果数组中入值
            if(left>=0){
                res[left] = nums[deque.peekFirst()];
            }
        }
        return res;
    }
}
