// Given the head of a singly linked list, reverse the list, and return the reversed list.

class Solution {
    public ListNode reverseList(ListNode head) {
     
        ListNode result = head;
        ListNode pre = null;
        
        if(result == null){
            return pre;
        }
        
        while(result.next != null){
            ListNode temp = result.next;
            result.next = pre;
            pre = result;
            result = temp;
        }
        result.next = pre;
        return result;
    }
}
