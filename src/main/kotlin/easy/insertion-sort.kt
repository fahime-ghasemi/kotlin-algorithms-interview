package easy

fun main() {
    println(insertionSort(intArrayOf(5, 2, 8, 9, 5, 6, 3)).joinToString())
}

fun insertionSort(input: IntArray): IntArray {
    var counter: Int
    for (i in 1 until input.size) {
        counter = i
        while (counter > 0 && input[counter] < input[counter - 1]) {
            swap(input, counter)
            counter--
        }
    }

    return input
}

fun swap(input: IntArray, counter: Int) {
    val temp = input[counter - 1]
    input[counter - 1] = input[counter]
    input[counter] = temp
}
