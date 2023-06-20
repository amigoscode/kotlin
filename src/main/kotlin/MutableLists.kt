fun main() {
    val names = mutableListOf(
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
    names.remove("Saleh")
    println(names)
    names.add("Alex")
    println(names)
    println(names.isEmpty())
    val emptyList = mutableListOf<Any>()
    println(emptyList.isEmpty())
}