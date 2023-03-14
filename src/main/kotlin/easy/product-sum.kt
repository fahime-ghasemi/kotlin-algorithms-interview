package easy
/**
We are given an array as input. Items of the array are numbers or other arrays. We are asked to calculate the product sum of the array
For nested arrays the sum should be multiply in the depth of the array
For example the product sum of the following array is 12
[5,2,[7,-1],3,[6,[-13,8],4]] => [5,2,[6*2],3,[6,[-5*3],4]] => [5,2,12,3,[6,-15,4]] => [5,2,12,3,-10] => 12

 */

fun main()
{
    println(productSum(arrayOf(5,2,arrayOf(7,-1),3,arrayOf(6,arrayOf(-13,8),4))))
}

fun productSum(array:Array<Any>):Int
{
    return productSumHelper(array,1)
}
/*
Time is O(N) where n is the total number of elements in the original array including all of the elements in each subarray
for the example above n is 12
Space is O(D) where D is the maximum depth of sub arrays
 */
fun productSumHelper(array:Array<Any>,level:Int):Int
{
    var sum = 0
    for(item in array)
    {
        if (item is Int)
            sum += item
        else if (item is Array<*> && item.isArrayOf<Any>())
        {
            sum += productSumHelper(item as Array<Any>,level+1)
        }
    }

    return sum * level
}