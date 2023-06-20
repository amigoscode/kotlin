fun main() {
    greet(age = 23, name = "Jamila")
    greet("Alex")
    greet("Bob", 11)
    // functionsAsArguments()
    println(double(10))

    println()

    val (v1, v2) = twoValues()
    println("$v1 $v2")
    val (t1, t2, t3) = threeValues()
    println("$t1 $t2 $t3")

}

fun double(n: Int): Int = n * 2

fun double2(n: Int): Int {
    return n * 2
}

fun twoValues(): Pair<String, Int> =
    "Amigos" to 20

fun twoValues2(): Pair<String, Int> =
    Pair("Amigos", 20)

fun threeValues():
        Triple<String, Int, Char> {
    return Triple(
        "Code",
        0,
        'Z'
    )
}

fun functionsAsArguments() {
    foo(bar = {
        println("bar as a function")
    })
    foo {
        println("bar as a function 2")
    }
    foo()
}

fun foo(
    name: String = "",
    bar: () -> Unit = {}
) {
    println("bar function")
    bar()
}

fun greet(name: String, age: Int = -1) {
    println("hello 👋 $name")
    if (age == -1) {
        println("age not provided\n")
        return
    }
    if (age >= 16) {
        println("$name $age - is an adult")
    } else {
        println("$name $age is not an adult")
    }
    println()
}
