package easy
/**
Given an array of coins [positive numbers] we want to find the minimum amount change that can not create with the given coins
For example with the array [1,2,4] result will be 5 because 5 is the minimum value that can not costructed the the given coins
We can not use a coin more than once 
The brute force solution is very complicated but there is a mathematical idea hidden in this algorithm which will help us to find the optimum solution which is not very complicated
 **/
fun main()
{
    println("${nonConstructableChange(intArrayOf(5,7,1,1,2,3,22))}")
}

fun nonConstructableChange(coins:IntArray) : Int?
{
    if (coins.isEmpty()) return null

    var currentChangeCreated = 0

    coins.sort()

    for(coin in coins)
    {
        if(currentChangeCreated + 1 < coin)
             return currentChangeCreated + 1   

        currentChangeCreated += coin
     
    }

    return currentChangeCreated + 1
}