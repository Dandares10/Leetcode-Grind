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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;

        while(node!=null&&node.next!=null){
            if(node.val==node.next.val){
                node.next=node.next.next; //skip the node that's equal
            }
            else{
                node = node.next;      //it's like continue 
            }
        }
        return head;
    }
}
