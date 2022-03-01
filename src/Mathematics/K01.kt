//Missing number in array

package Mathematics

fun main() {
    val n = readLine()!!.toInt()
    val array = Array(n-1){readLine()!!.toInt()}

    print("missing number = " + missingNumber(array, n))

    /*
    //to print array
    for (i in array)
        print("$i ")
    */
}

fun missingNumber(array: Array<Int>, n: Int): Int {
    val sum = (n*(n+1)) / 2;
    var total = 0;
    for (i in array)
        total += i
    return sum - total
}
