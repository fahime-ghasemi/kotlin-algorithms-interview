package easy
/**
 *   For the given input string of "aaaaaaaaaaaaaff6yykkk" the result is "9a4a2f162y3k"
 *   We are asked to encode a string with counting the chars which repeat. If the count is more than 9 we should start from scratch
 */
fun main() {
    println(runLengthEncoding("aaaaaaaaaaaaaff6yykkk"))
}

/**
 *  Time is O(n)
 *  Space is O(n)
 */
fun runLengthEncoding(input: String): String {
    if (input.isEmpty()) return ""
    var count = 1
    var char = input[0]
    val result = StringBuilder()
    for (i in 1 until input.length) {
        if (input[i] != char || count == 9) {
            result.append("$count$char")
            count = 1
            char = input[i]
        } else
            count++

    }
    result.append("$count$char")
    return result.toString()
}

