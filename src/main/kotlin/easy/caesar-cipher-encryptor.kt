/**
We are given a string and an integer as n.
The string can not be empty and can only contain lower case english alphabets
We are asked to return a new string which is created with shifting the input string
We should shift the string to the left n times. For example shifting xyz 2 times will create zab string
 */
package easy

fun main() {
    println(caesarCipherEncryptor("xyz", 2))
    println(caesarCipherEncryptor("abc", 2))

}

/*
    Time is O(N)
    Space is O(N)
 */
fun caesarCipherEncryptor(input: String, number: Int): String {
    if (number < 0) return input

    val result = mutableListOf<Char>()
    var newCode: Int
    val key = number % 26

    for (char in input) {
        newCode = char.code + key
        result += if (newCode > 'z'.code) (newCode % 122 + 96).toChar() else newCode.toChar()
    }

    return result.joinToString()
}

