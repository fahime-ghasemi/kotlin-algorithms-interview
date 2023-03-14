package easy
fun main()
{
    println(bubbleSort(intArrayOf(-1,0,-4,5,2,1)).joinToString())

    println(bubbleSort(intArrayOf(-1,2,3,4,)).joinToString())

}
/**
    Time is O(N*N) Best case is O(N) when the given array is sorted
    Space is O(1)
 */
fun bubbleSort(array:IntArray):IntArray
{
    var temp : Int
    var isSorted = true
    for(i in array.size - 2 downTo 0 )
    {
        for(j in 0 .. i)
        {
             if(array[j]>array[j+1])
               {
                    isSorted = false
                    temp = array[j]
                    array[j] = array[j+1]
                    array[j+1] = temp
               }   
        }

        if(isSorted) break
    }

   return array     
}