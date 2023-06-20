fun main() {

}

// blueprint
class SmartDevice(
    // properties
    var brand: String?,
    var price: Double?,
    var isSwitchedOn: Boolean? = false
) {
    constructor() : this(null, null)
    constructor(
        brand: String
    ) : this(brand, 0.0)

    // method/functions/behaviours
    fun getDeviceState() {
        println("$brand is on: $isSwitchedOn")
    }
    fun turnOn() {
        isSwitchedOn = true
        println("$brand is switching on")
    }
    fun turnOff() {
        isSwitchedOn = false
        println("$brand is switching off")
    }

    override fun toString(): String {
        return "SmartDevice(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        return isSwitchedOn == other.isSwitchedOn
    }

    override fun hashCode(): Int {
        var result = brand?.hashCode() ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + (isSwitchedOn?.hashCode() ?: 0)
        return result
    }
}

fun classesExample() {
    val tv = SmartDevice(
        "Samsung Smart TV QLED",
        1000.00
    )
    // tv.brand = "Samsung Smart TV QLED"
    // tv.price = 1000.00
    println("${tv.brand} ${tv.price}")
    tv.turnOn()
    tv.getDeviceState()

    println()

    val phone = SmartDevice("Apple Iphone")
    phone.price = 1200.00
    println("${phone.brand} ${phone.price}")
    phone.turnOff()
    phone.getDeviceState()

    val laptop = SmartDevice()
}
fun toStringExample() {
    val tv = SmartDevice(
        "Samsung Smart TV QLED",
        1000.00
    )
    println(tv)
    //
    println(tv.brand)
    println(tv.price)
    println(tv.isSwitchedOn)
}

fun equalityExample() {
    val tv1 = SmartDevice(
        "Samsung Smart TV QLED",
        1000.00
    )
    val tv2 = SmartDevice(
        "Samsung Smart TV QLED",
        1000.00
    )
    println("== ${tv1 == tv2}")
    println("=== (memory location) ${tv1 === tv2}")
}
