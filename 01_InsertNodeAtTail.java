/*
Problem: Insert a Node at the Tail of a Linked List
Platform: HackerRank
Difficulty: Easy

Problem Statement:
Given the pointer to the head node of a linked list and an integer to add to the list,
create a new node with the given integer and insert it at the tail of the linked list.
Return the head of the modified list.

Approach:
1. Create a new node with the given data.
2. If the list is empty (head == null), return the new node.
3. Otherwise, traverse to the last node using a temporary pointer.
4. Attach the new node at the end.
5. Return the original head of the list.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);

        // Case 1: If list is empty
        if(head == null) {
            return newnode;
        }

        // Traverse to last node
        SinglyLinkedListNode temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        // Attach new node
        temp.next = newnode;

        // Return head of list
        return head;
    }
}
