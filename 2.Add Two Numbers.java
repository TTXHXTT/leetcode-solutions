/*
2. Add Two Numbers
2. 两数相加
Solved
  已解决
Medium
  中等
Topics
  主题
premium lock icon
Companies  公司  公司 公司
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
你给出两个非空的链表，分别表示两个非负整数。这些数字以逆序存储，并且它们的每个节点都包含一个数字。将这两个数字相加，并以链表的形式返回它们的和。

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
你可以假设这两个数字不包含任何前导零，除了数字 0 本身。

 

Example 1:  示例 1：  示例 1： 示例 1：


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:  示例 2：  示例 2： 示例 2：

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:  示例 3:  示例 3: 示例 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:  约束条件：

The number of nodes in each linked list is in the range [1, 100].
每个链表中的节点数量在 [1, 100] 范围内。
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
保证该列表表示的数字没有前导零。
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummyHead = new ListNode();
        ListNode curr = dummyHead;
        int carry = 0;
        int sum = 0;
        while( l1!=null || l2!=null || carry!=0){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            sum = x+y+carry;
            carry = sum / 10;
            curr.next = new ListNode(sum%10);
            curr=curr.next;
            //if(l1!=null)
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }

        return dummyHead.next;
    }
}