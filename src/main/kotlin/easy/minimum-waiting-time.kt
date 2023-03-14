package easy
/**
we are given an array of positive numbers. Each number represents the duration of a query that needs to be run. The input array has
at least one number. We want to minimize the amout of total waiting time for all of the queries such that they are exexuted as fast as possible
we're asked to return the minium time
*/
fun main()
{
   println(minimumWaitingTimeVersion2(intArrayOf(3,2,1,2,6)))
}

/**
Time complexity is O(nlogn)
Space complexity is O(1)
 */
fun minimumWaitingTimeVersion1(queries:IntArray) :Int
{
    if(queries.size == 1) return 0

    queries.sort()

    var itemWaitingTime = queries[0]
    var totalWaitingTime = itemWaitingTime

    for(i in 2 until queries.size)
    {
        itemWaitingTime += queries[i-1]
        totalWaitingTime += itemWaitingTime
    }

    return totalWaitingTime

}

fun minimumWaitingTimeVersion2(queries:IntArray) :Int
{
    var totalWait = 0
    queries.sort()

    for((index,query) in queries.withIndex())
    {
        totalWait += (queries.size - index - 1) * query
    }

    return totalWait
}

