fun main() {
    val isAdult = true
    val isFemale = false
    val isDriver = true
    println(isAdult && (isFemale || isDriver))
    println(isFemale || isAdult)
    println(!isAdult)
    println(!isFemale)
}