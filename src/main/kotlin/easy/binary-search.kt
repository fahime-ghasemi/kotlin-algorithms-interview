package easy
/**
 * Write a function that takes in a sorted array of integers as well as a target integer.
 * The function should use the Binary Search algorithm to find if the target number is contained in the array and should return its index if it is, otherwise -1.
 * **/
import kotlin.math.floor

fun main() {
    println("result is ${binarySearch(intArrayOf(2,6,8,9,12,22,34),22)}")
}

/**
Average and worst O(log(n)) Time and O(1) space
recursive solution will have O(log(n)) time and O(log(n)) space
 */
fun binarySearch(array:IntArray,target:Int):Int
{
    var left = 0
    var right = array.size - 1
    var mediumIndex : Int

    while(left<=right)
    {
        mediumIndex = floor((right + left / 2).toDouble()).toInt()
        if(array[mediumIndex] == target)
            return mediumIndex

        if(target<array[mediumIndex])
            right = mediumIndex - 1
        else
            left = mediumIndex + 1
    }


    return -1
}