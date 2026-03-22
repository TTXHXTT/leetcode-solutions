class Solution {
    public ListNode reverseList(ListNode head) {
       
        
        
I use a pointer to build the reversed list.

I go through the linked list.
For each node, I save the next node,
then reverse the pointer,
and move pointer forward.

At the end, I return the new head.

Time is O(n), space is O(1).


         
        ListNode res = null;

        while(head!=null){
            //用来存放后续链表，因为一会要断链
            ListNode curr = head.next;
            //反向指，把当前值指向结果链
            head.next=res;
            //存入结果链表
            res = head;
            //接回断链除
            head = curr;
            //接下来也就是从断链重新开始
        }
        return res;
    }
}
