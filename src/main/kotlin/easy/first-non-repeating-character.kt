package easy
/**
 *  We are given a string and want to find the index of the first character which in non repeating
 *  The input string only contains the lower case alphabet of english language
 */
fun main() {
    println(firstNonRepeatingCharacter("abcdcaf"))
}
/*
    Time is O(n)
    Space is O(1) the reason for this space complexity is that we know that the length of hash table is at most 26
    if we didn't have this constraint in the input, the space was O(c) where c was the number of unique characters
 */
fun firstNonRepeatingCharacter(input: String): Int {
    val charTable = HashMap<Char, Int>()

    for (char in input) {
        charTable[char] = if (charTable[char] == null) 1 else charTable[char]!! + 1
    }

    for (i in input.indices) {
        if (charTable[input[i]] == 1) return i
    }

    return -1
}