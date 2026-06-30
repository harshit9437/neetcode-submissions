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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1) return null;
        
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==n){
            head=head.next;
            return head;
        }
        int num=count-n;
        ListNode first=head;
        ListNode second=first.next;
        for(int i=1;i<num;i++){
            first=first.next;
            second=first.next;
        }
        first.next=second.next;
        second.next=null;
        
        return head;

    }
}
