public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        
        while(f!=null&&f.next!=null){

            //转圈指导相遇
            f=f.next.next;
            s=s.next;
            if(s==f){
                return true;
            }
        }
        return false;

    }
}
