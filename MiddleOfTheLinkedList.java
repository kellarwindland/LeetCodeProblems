// Given a non-empty, singly linked list with head node head, return a middle node of linked list.
// If there are two middle nodes, return the second middle node.

class Solution {
    public ListNode middleNode(ListNode head) {
        
        int length = 0;
        ListNode temp = head;
        
        while(temp != null){
            length++;
            temp = temp.next;
        }
        
        temp =  head;
        
        for(int i = 0; i < (length / 2); i++){
            temp = temp.next;
        }
        
        
        System.out.println(temp.val);
        return temp;
    }
}
