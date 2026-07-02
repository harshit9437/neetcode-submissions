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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right)
    return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        dummy.next=head;
        int diff=right-left;
        for(int i=0;i<diff;i++){
            fast=fast.next;
            
        }
        int count=1;
        while(count!=left){
            
            prev=prev.next;
            slow=slow.next;
            fast=fast.next;
            count++;
        }

        ListNode front=fast.next;
        fast.next=null;
        prev.next=null;
        ListNode temp=slow;
        ListNode point=null;
        while(temp!=null){
            ListNode rest=temp.next;
            temp.next=point;
            point=temp;
            temp=rest;
        }
        prev.next=point;
        slow.next=front;
        return dummy.next;
            
    }
    }
