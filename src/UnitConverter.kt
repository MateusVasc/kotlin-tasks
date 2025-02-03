fun UnitConverter(temp: Double, tempInType: String, tempOutType: String): Double {

    return when (tempInType) {
        "C" -> when (tempOutType) {
            "F" -> (temp * 9.0/5) + 32
            "K" -> temp + 273.15
            else -> temp
        }
        "F" -> when (tempOutType) {
            "C" -> (temp - 32) * 5.0 / 9
            "K" -> (temp - 32) * 5.0 / 9 + 273.15
            else -> temp
        }
        "K" -> when (tempOutType) {
            "C" -> temp - 273.15
            "F" -> (temp - 273.15) * 9.0 / 5 + 32
            else -> temp
        }
        else -> throw IllegalArgumentException("Invalid temperature type")
    }
}

fun main() {
    println(UnitConverter(0.0, "C", "F"))
}