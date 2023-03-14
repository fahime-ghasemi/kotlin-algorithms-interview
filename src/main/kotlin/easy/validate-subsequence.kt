/**
 * You are given an array and a sub array. What you should do is check if the sub array exists in the array or not.
 */

package easy

fun main()
{
    println("result is ${isValidSubsequence(intArrayOf(5,1,2,3,4),intArrayOf(1,2,3))}")
}

// O(N) time and O(1) space
fun isValidSubsequence(array: IntArray, sequence: IntArray) : Boolean
{
        var i = 0
        var sequenceStarted = false
        for(item in array)
        {
            if(item == sequence[i])
            {
               sequenceStarted = true
               i++

               if(i == sequence.size) return true

            } else if (sequenceStarted) return false
        }

    return sequenceStarted
}