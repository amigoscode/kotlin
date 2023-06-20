fun main() {
    val names = listOf(
        "Jamila",
        "Jamas",
        "Saleh",
        "Peter"
    )
    println(names[0])
    println(names.size)
    println(names.contains("Peter"))
    println(names.contains("Foo"))
    println(names.first())
    println(names.last())
    println(names.indexOf("Saleh"))
    println(names)
}