package easy

/*
    We are given two strings as input, and we are asked to say if generating the document with the given characters is possible or not
    For example if the given document needs 3 spaces we should have 3 spaces in the characters and so on and so forth
 */
fun main() {
    println(generateDocument("fahiggggegm", "fahime"))
}

/*
    Time is O(m + n)
    Space is O(c) where c is the number of unique characters in the characters string
 */
fun generateDocument(characters: String, document: String): Boolean {
    if (characters.length < document.length) return false

    val charTable = HashMap<Char, Int>()

    for (char in characters) {
        charTable[char] = if (charTable[char] == null) 1 else charTable[char]!! + 1
    }

    for (char in document) {
        if (charTable[char] == null || charTable[char] == 0) return false
        charTable[char] = charTable[char]!! - 1
    }

    return true
}