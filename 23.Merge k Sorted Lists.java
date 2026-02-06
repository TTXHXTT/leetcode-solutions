class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
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
