package easy
/**
given a sorted array of integers, write a function that returns squared value of each array item in a sorted array
output will be a sorted array of squared value of array items
 **/
import kotlin.math.abs


fun main()
{
        println("result is ${sortedSquredArray(intArrayOf(-7,-5,-4,3,6,8,9)).joinToString()}")
}

/*
Time and Space complexity of this algorithm in O(n)
 */
 fun sortedSquredArray(input:IntArray):IntArray
 {
    val result = IntArray(input.size)
    var left = 0
    var right = input.size - 1
    var index = input.size - 1 
    while(left<=right)
    {
        if(abs(input[left])<=abs(input[right]))
        {
            result[index] = input[right] * input[right]
            right --
        }else{
            result[index] = input[left] * input[left]
            left ++
        }
        index --
    }

    return result
 }