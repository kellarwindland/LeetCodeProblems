// Given a sorted linked list, delete all duplicates such that each element appear only once.

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode ahead;
        if(head == null){
            return head;
        }else if(head.next == null){
            return head;
        }else{
            ahead = head.next;
        }
        
        ListNode temp = head;
        while(temp.next != null){
            if(temp.val == ahead.val){
                temp.next = ahead.next;
                ahead = temp.next;
            }else{
                temp = temp.next;
                ahead = ahead.next;
            }
        }
        
        return head;
    }
}
