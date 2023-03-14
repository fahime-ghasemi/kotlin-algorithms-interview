/**
 * Write a function that returns the nth item of fibonacci series. The first item in fibonacci is 0
 */
package easy
fun main()
{
    println("result is ${nthFibonacci(4)}")
}

fun nthFibonacci(number:Int):Int?
{
    if (number <= 0) return null

    if(number == 1) return 0
    if(number == 2) return 1

    return nthFibonacci(number-1)!!.plus(nthFibonacci(number-2)!!)
}