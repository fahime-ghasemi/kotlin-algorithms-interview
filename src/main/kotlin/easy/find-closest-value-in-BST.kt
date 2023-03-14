package easy

/**
 * You are given a BST data structure consisting of BST nodes. Each BST node has an integer value stored in a property called "value" and two children nodes stored in properties called "left" and "right," respectively. A node is said to be a BST node if and only if it satisfies the BST property: its value is strictly greater than the values of every node to its left; its value is less than or equal to the values of every node to its right; and both of its children nodes are either BST nodes themselves or None (null) values. You are also given a target integer value; write a function that finds the closest value to that target value contained in the BST. Assume that there will only be one closest value.
 */
import kotlin.math.abs

fun main() {
    println("result is ${findClosestValueInBST(10, creaseBST())}")
}

fun creaseBST(): Node {

    return Node(10, Node(7, Node(3), Node(9)), Node(19, Node(16), Node(12)))
}
/*
 Recursive version
 Average: O(log(n)) time | O(log(n)) space
 Worst: O(n) time | O(n) space
 */

/*fun easy.findClosestValueInBST(target: Int, root: easy.Node): Int {

    return findClosestValueInBSTHelper(target, root.value, root)
}

fun findClosestValueInBSTHelper(target: Int, selectedClosestValue: Int, tree: easy.Node): Int {
    if (selectedClosestValue == target) return selectedClosestValue

    var closestValue = if (abs( selectedClosestValue - target) > abs(tree.value - target))
        tree.value
    else selectedClosestValue

    if (target < selectedClosestValue && tree.left != null)
        closestValue = findClosestValueInBSTHelper(target,closestValue, tree.left)
    else if (target > selectedClosestValue && tree.right != null)
        closestValue = findClosestValueInBSTHelper(target, closestValue, tree.right)


    return closestValue

}*/


/*
Iterative version
Average: O(log(n)) time | O(1) space
Worst: O(n)) time | O(1) space
 */
fun findClosestValueInBST(target: Int, tree: Node): Int {

    var currentNode: Node? = tree
    var closestValue = tree.value


    while (currentNode != null) {
        if (currentNode.value == target) return target

        closestValue = if (abs(closestValue - target) > abs(currentNode.value - target))
            currentNode.value
        else closestValue

        if (target < closestValue) {
            currentNode = tree.left
        } else if (target > closestValue)
            currentNode = tree.right

    }
    return closestValue
}