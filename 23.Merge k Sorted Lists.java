class Solution {
    public ListNode mergeKLists(ListNode[] lists) {


I use a min heap to always get the smallest node among all lists.

First, I put the head of each non-null list into the heap.
Then I create a dummy node to build the result list.

Each time, I pop the smallest node from the heap,
attach it to the result list,
and if that node has a next node, I push the next node into the heap.

This way, the heap always keeps the smallest available node from each list.

Finally, I return the merged list.

Time is O(n log k), and space is O(k).
    
        //如lists不存在或长度为0，返回null
        if(lists==null||lists.length==0) return null;
        //创建堆，存入各个链表头元素
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a,b) -> a.val - b.val);
        
        for(ListNode x : lists){
            if(x!=null) heap.offer(x);
        }
        
        //创建最终结果，与尾巴结果
        ListNode res = new ListNode(0);
        ListNode tail = res;
        
        //遍历直到堆为空
         while(!heap.isEmpty()){
            //暂存当前最小值
            ListNode node = heap.poll();
            //存入结果
            tail.next=node;
            tail = tail.next;
            //如这个元素后面不为空，继续存入堆中
            if(node.next!=null){
                heap.offer(node.next);
            }
         }
         return res.next;
    }
}
