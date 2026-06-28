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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i=list1;
        ListNode j=list2;
        ListNode temp=list1;
        ListNode head=list1;
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(i.val <=j.val){
            head=list1;
            temp=i;
            i=i.next;
        }else{
            head=list2;
            temp=j;
            j=j.next;
        }

        
        while(i!=null && j!=null){
            if(i.val<=j.val){
                temp.next=i;
                temp=i;
                i=i.next;
            }else{
                temp.next=j;
                temp=j;
                j=j.next;
            }
        }
        while(i!=null){
            temp.next=i;
            temp=i;
            i=i.next;
        }
        while(j!=null){
            temp.next=j;
            temp=j;
            j=j.next;
        }
        return head;
    }
}