public class Solution {
    public boolean hasCycle(ListNode head) {
        
I use two pointers, fast and slow.
Both start from the head.

The fast pointer moves two steps,
and the slow pointer moves one step.

If they meet, there is a cycle.
If the loop ends, there is no cycle.

Time is O(n), space is O(1).
        
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
