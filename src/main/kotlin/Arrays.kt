fun main() {
    // val name: String = "Jamila, Jamas"
    val names = arrayOf(
        "Jamila", "Jamas", "Samee"
    )
    println(names[0])
    names[0] = "Samira"
    println(names[1])
    println(names[2])
    println(names.size)
    if ("Jamas" in names) {
        println("found")
    } else {
        println("not found")
    }
    // println(names[3])
    println(names.contentToString())

    //

    val arrayOfNulls =
        arrayOfNulls<String>(5)

    arrayOfNulls.fill("*")

    arrayOfNulls[4] = "hello"

    println(arrayOfNulls.contentToString())


}