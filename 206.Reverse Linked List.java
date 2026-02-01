class Solution {
    public ListNode reverseList(ListNode head) {
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
