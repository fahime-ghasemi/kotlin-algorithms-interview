/**
We are given a string as input and we are asked to check if that string is palindrome or not
a palindrome string is a string which the same when we read it forward or backward
for example abcdcba is a palindrome string
 */
package easy

fun main() {
    println(isPalindrome("abcdcba"))
}

fun isPalindrome(input: String): Boolean {
    var left = 0
    var right = input.length - 1

    while (left < right) {
        if (input[left] != input[right])
            return false

        left++
        right--
    }

    return true
}