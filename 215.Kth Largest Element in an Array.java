class Solution {
    public int findKthLargest(int[] nums, int k) {

I use a min heap of size k.

I go through the array and add each element to the heap.
If the size exceeds k, I remove the smallest element.

This way, the heap always contains the k largest elements.

At the end, the top of the heap is the k-th largest.

Time is O(n log k), space is O(k).
    
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
