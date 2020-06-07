// Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode temp = node;
        boolean check = true;
        while(check && temp.next != null){
            temp.val = temp.next.val;
            if(temp.next.next == null){
                temp.next = null;
                check = false;
            }else{
            temp = temp.next;
            }
        }        
    }
}
