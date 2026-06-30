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
        ListNode i=head;
        ListNode j=head;
        for(int k=0;k<n;k++){
            j=j.next;
        }
        if(j==null){
            head=head.next;
            return head;
        }
        while(j.next!=null){
            i=i.next;
            j=j.next;
        }
        ListNode temp=i.next;
        i.next=temp.next;;
        temp.next=null;
        
        return head;


    }
}
