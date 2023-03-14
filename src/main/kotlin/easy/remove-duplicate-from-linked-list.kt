package easy
/**
We are given a head node of a linked list and we are asked to remove all of the duplicate values from the linked list 
and return the same linked list with all of the duplicate values removed. The given linked list is already sorted
 */

 fun main()
 {
    println(removeDuplicates(createLinkedList()).toString())
 }

 fun createLinkedList():LinkedListNode
 {
    return LinkedListNode(1,LinkedListNode(1,LinkedListNode(1,LinkedListNode(1,LinkedListNode(1,LinkedListNode(1,LinkedListNode(1,LinkedListNode(1,LinkedListNode(2)))))))))
 }

/**
    Space complexity is O(1)
    Time complexity is O(n)
 */
 fun removeDuplicates(head:LinkedListNode) : LinkedListNode {
    var currentNode = head

    while(currentNode.nextNode!=null)
    {
        if(currentNode.value == currentNode.nextNode!!.value)
             currentNode.nextNode = currentNode.nextNode!!.nextNode
        else
            currentNode = currentNode.nextNode!!    
    }

    return head
 }

 data class LinkedListNode(val value:Int,var nextNode:LinkedListNode? = null)