/**
Write depth first search algorithm for traverse a tree. Given a tree return an array of characters. Evey node in the tree has a character as its value
 **/

 fun main()
 {
    val tree = TreeNode('A')
    val child1 = TreeNode('B')
    child1.addChild(TreeNode('E'))
    val child2 = TreeNode('C')

    tree.addChild(child1)
    tree.addChild(child2)

    println(depthFirstSearch(tree).joinToString())
 }

/**
 * Time complexity of this algorithm is O(N+E) where E is the number of edges and space complexity if O(N)
 */
 fun depthFirstSearch(tree:TreeNode) : Array<Char>
 {
   val result = depthFirstSearchHelper(tree,mutableListOf())

   return result.toTypedArray()

 }

 fun depthFirstSearchHelper(tree:TreeNode,array:List<Char>) : List<Char>
 {
     val result = mutableListOf(tree.value)

     for(child in tree.children)
     {
        result += depthFirstSearchHelper(child,array)
     }

     return result

 }

 class TreeNode(val value:Char)
 {
    val children = mutableListOf<TreeNode>()

    fun addChild(child:TreeNode)
    {
        children += child
    }
 }

