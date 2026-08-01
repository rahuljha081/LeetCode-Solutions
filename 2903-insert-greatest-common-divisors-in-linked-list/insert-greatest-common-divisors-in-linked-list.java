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
    int findDivisor(int first,int second){
        int val=Math.min(first,second);
        for(int i=val;i>=0;i--){
            if(first%i==0&&second%i==0)return i;
        }
        return -1;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null||head==null) return head;
        ListNode temp=head;
        while(temp.next!=null){
            int value=findDivisor(temp.val,temp.next.val);
            ListNode node=new ListNode(value);
            node.next=temp.next;
            temp.next=node;
            temp=node.next;
        }
        return head;
    }
}