package easy

/**
We are given an array of integers and we are asked to find three largers numbers in this array
 */

fun main() {
    println(findThreeLargestNumbers(intArrayOf(141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7)).joinToString())
}

/*
    Time is O(N)
    Space is O(1)
 */
fun findThreeLargestNumbers(array: IntArray): IntArray {
    val result = IntArray(3) { Int.MIN_VALUE }
    for (item in array) {
        if (item > result[2]) {
            result[0] = result[1]
            result[1] = result[2]
            result[2] = item

        } else if (item > result[1]) {
            result[0] = result[1]
            result[1] = item
        } else if (item > result[0])
            result[0] = item
    }

    return result
}