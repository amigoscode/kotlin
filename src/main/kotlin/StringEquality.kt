fun main() {
    val name1 = "Saleh"
    val name2 = "Jamila"
    val name3 = String("Saleh".toCharArray())
    // val name3 = "Saleh"

    println("== ${name1 == name3}")
    println("=== ${name1 === name3}")
    println(".equals ${name1.equals(name3)}")
}