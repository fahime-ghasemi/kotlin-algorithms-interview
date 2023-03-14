package easy

/**
 * Given a binary tree, return an array that consist of each branch's sum
 */
fun main()
{
    val root = Node(4, Node(3,null,null), Node(1,null,null))
    println("result is ${branchSum(root).contentToString()}")
}

fun branchSum(root: Node): IntArray?
{
   if(root == null) return null

   return calculateBranchSum(root,0)

}

fun calculateBranchSum(node: Node, sum:Int):IntArray
{
    var result = intArrayOf()

    if(node.left == null && node.right == null) {
        result += sum + node.value
        return result
    }

    if(node.left != null) {
        result += calculateBranchSum(node.left,sum+node.value)

    }
    if(node.right != null) {
        result += calculateBranchSum(node.right,sum+node.value)
    }

    return result

}