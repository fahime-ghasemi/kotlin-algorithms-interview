package easy

/**
write a function that takes a binary tree and returns the sum of all nodes' depth
 */

fun main()
{
    val root = Node(4, Node(3, Node(4, Node(1))), Node(1))
    println("result is ${nodeDepths(root)}")
}
/**
Time complexity is O(n) and space complexity is O(h) where h is the height of the tree
We can implement the iterative version of this algorithm by using stack data structure
recursive version is cleaner and more readable and there is no difference in time and space complexity
 */
fun nodeDepths(tree: Node):Int
{
    return nodeDepthsHelper(tree,0)
}

fun nodeDepthsHelper(tree: Node?, level:Int):Int
{
    if(tree == null) return 0
    return nodeDepthsHelper(tree.left,level+1) + nodeDepthsHelper(tree.right,level+1) + level
}

