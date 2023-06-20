fun main() {
    val input = "M"
    val gender = when(input) {
        "F" -> "FEMALE"
        "M" -> "MALE"
        else -> {
            "Unknown Gender"
        }
    }
    println(gender)
}