fun main() {
    val nums = intArrayOf(
        1, 2, 3, 4, 5, 6, 7, 8)
    for (n in nums) {
        if (n % 2 != 0) continue
        if (n > 5) break
        println(n)
    }
    println("some other code")

    // this is not allowed
    /*
    nums.forEach {
        if (it == 2) {
            break
        }
    }
    */
}