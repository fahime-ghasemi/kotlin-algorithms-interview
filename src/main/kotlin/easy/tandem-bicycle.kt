package easy
/**
We have 3 inputs. The first input is an array of positive numbers that shows the speed of riders that are wearing red shirts.
The second input is an array that its size is equal to the first array and represents the speed of riders that are wearing blue shirts.
The third input is a boolean which can be true or false
we are asked to pair red riders with blue riders for operating on tandem bicycles. How should we pair riders? if the third input is true
we should pair riders so that we have the maximum total speed and if the third input is false we should pair riders so that we have
the minimum total speed. Speed of each tandem bicycle is equal to speed of the fastest rider
 */
fun main()
{
    println(tandemBicycle(intArrayOf(5,5,3,9,2),intArrayOf(3,6,7,2,1),false))
}
/*
    Time complexity is O(nlogn)
    Space complexity is O(1)
 */
fun tandemBicycle(redRiders:IntArray,blueRiders:IntArray,fastest:Boolean): Int
{
    var totalValue = 0

    if(fastest)
    {
        redRiders.sort()
        blueRiders.sortDescending()
    }else{
        redRiders.sort()
        blueRiders.sort()
    }

    for(i in redRiders.indices)
    {
        totalValue += if(redRiders[i] > blueRiders[i])
             redRiders[i]
        else blueRiders[i]
    }

    return totalValue
}