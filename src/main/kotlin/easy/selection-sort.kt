package easy

fun main() {
    println(selectionSort(intArrayOf(8, 5, 2, 9, 5, 6, 3)).joinToString())
}

fun selectionSort(input: IntArray): IntArray {
    var smallestItemIndex: Int
    var counter = 0
    while (counter < input.size - 2) {
        smallestItemIndex = counter
        for (i in counter + 1 until input.size) {
            if (input[i] < input[smallestItemIndex])
                smallestItemIndex = i
        }
        swap(input, counter, smallestItemIndex)
        counter++
    }
    return input
}

fun swap(input: IntArray, counter: Int, smallestItemIndex: Int) {
    val temp = input[counter]
    input[counter] = input[smallestItemIndex]
    input[smallestItemIndex] = temp
}