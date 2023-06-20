fun main() {
    val n1 = 31
    val n2 = 20

    if (n1 >= n2 || n1 <= 30) {
        println(":)")
    } else if (n1 == 100) {

    } else if (n1 == 200) {

    } else {
        println(":(")
    }

    // if else to when expression

    when {
        (n1 >= n2 || n1 <= 30) -> println(":)")
        (n1 == 100) -> println("foo")
        (n1 == 100) -> println("foo")
        (n1 == 100) -> println("foo")
        else -> println(":(")
    }

    val age = 18

    when (age) {
        in 13..19 -> println("Teenager")
        !in 0..12 -> println()
        else -> println()
    }

    println("some code")
}