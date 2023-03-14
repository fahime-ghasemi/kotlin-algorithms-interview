package easy
/**
We are given two arrays. The first array represents the height of students who are wearing red shirts and the seond array represents
the height of students who are wearing blue shirts. These arrays always have the same length. We are asked to detemine if we can take a photo of these students
that has the following constrants.
1- All of the students that are wearing blue shirst must be in the same row
2- All of the students that are wearing red  shirst must be in the same row
3- Every students that are in the front row must be shorter than all the students that are in the back row. Equality is not accepted
4- Our photo must have exactly two rows

The function should return true or false
 */

fun main()
{
    println(classPhotos(intArrayOf(5,8,1,3,4),intArrayOf(6,9,1,4,5)))
}

/**
    Time complexity is O(nlogn)
    Space complexity is O(1)
 */
fun classPhotos(redStudents:IntArray,blueStudents:IntArray): Boolean
{
    redStudents.sort()
    blueStudents.sort()

    val colorMustBeInFirstRow = if (redStudents[0]<blueStudents[0]) "RED" else "BLUE"

    for(i in redStudents.indices)
    {
        if(colorMustBeInFirstRow == "RED")
        {
            if(redStudents[i]>=blueStudents[i]) return false

        } else {
            if(blueStudents[i]>=redStudents[i]) return false

        }

    }
    return true
}