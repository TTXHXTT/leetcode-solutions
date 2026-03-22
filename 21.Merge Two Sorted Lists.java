class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

I use a dummy node to build the result list.

I go through both lists at the same time.
Each time, I compare the values and attach the smaller one.

After the loop, I attach the remaining nodes.

Finally, I return the merged list.

Time is O(n + m), space is O(1).
        
        //用来存储最初的头
        ListNode res1 = new ListNode();
        //用来编辑链表
        ListNode res = res1;

        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                res.next=list1;
                list1=list1.next;

                }
            else{
                res.next=list2;
                list2=list2.next;
                }
            res=res.next;
        }
        //跳出循环后代表一定有一个表空了
        res.next=(list1!=null) ? list1 : list2;
        //返回头的下一个，就是第一个值
        return res1.next;
        
    }
}
