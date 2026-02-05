class Solution {
    public int findKthLargest(int[] nums, int k) {
        //这是一个默认完整的二叉树，小顶堆
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int x : nums){
            //将新元素压入堆中
            heap.offer(x);
            //如果堆中大于k个元素，poll掉堆顶（即堆中最小值）
            if(heap.size()>k){
                heap.poll();
            }
        }
        //返回堆顶（即堆中最小值）
        return heap.peek();
    }
}
