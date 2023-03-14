package easy

/**
We want to know the winner of a tournament
we have got two arrays as input. One array is the list of competitions and another array is the result of each competition.
Each competition shows with a pair of strings. If the first pair's item won in the competition we will have 1 in the result array for that competition
and if the second pair's item won we will have 0 for that competition. With all said the function should return a string which is the winner of the tournament
 */
import kotlin.collections.HashMap

fun main() {
    println("the result is ${tournamentWinner(arrayOf("a" to "b", "b" to "c", "f" to "c"), intArrayOf(0, 0, 0))}")
}

/**
Time is O(n) and space is O(k) where k is the number of teams
Pay attention that whenever you need to create a data structure and after that you should find the max in that created DS you can merge these
steps into one
 */

const val HOME_TEAM_WON = 1
const val WINNER_SCORE = 3

fun tournamentWinner(competitions: Array<Pair<String, String>>, result: IntArray): String {
    val scores = HashMap<String, Int>()
    var winner = ""
    var competitionWinner: String

    for ((index, competition) in competitions.withIndex()) {
        competitionWinner = if (result[index] == HOME_TEAM_WON) competition.first else competition.second
        updateScores(competitionWinner, WINNER_SCORE, scores)
        if (winner.isNotEmpty()) {
            if (scores[competitionWinner]!! > scores[winner]!!) {
                winner = competitionWinner
            }
        } else {
            winner = competitionWinner
        }
    }

    return winner
}

fun updateScores(winner: String,score:Int, scores: HashMap<String, Int>) {
    if (scores[winner] != null)
        scores[winner] = scores[winner]!! + score
    else
        scores[winner] = score
}
