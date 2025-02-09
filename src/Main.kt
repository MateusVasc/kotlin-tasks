fun main() {
    val age = 20 // read only
    var i = 1 // mutable

    while (i < age) {
        println("This is i: $i") // string templates
        println("This is age: $age") // string templates
        i++
        println("This was i before: ${i - 1}") // string templates
    }

    var name: String // to declare a variable without initialization you gotta type it with ": type"

    // Collections
    val shapes: List<String> = listOf("triangle", "aquare", "circle") // read only list
    println(shapes)

    val mutableShapes: MutableList<String> = mutableListOf("triangle", "aquare", "circle") // mutable list
    mutableShapes.add("retangle")
    mutableShapes.removeFirst()
    println(mutableShapes)

    val fruits: Set<String> = setOf("apple", "banana", "cherry", "cherry") // read only set
    println(fruits)

    val mutableFruits: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry") // mutable set
    println(mutableFruits) // duplicate items are removed on set because they contain only unique elements

    val juiceMenu: Map<String, Int> = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100) // read only map
    println(juiceMenu)

    val mutableJuiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100) // mutable map
    println(mutableJuiceMenu)
    println(mutableJuiceMenu.containsKey("kiwi"))
    println(mutableJuiceMenu.keys)
    println(mutableJuiceMenu.values)

    // if and when
    val n: Int
    val bool = true

    if (bool) {
        n = 1
        println(n)
    } else {
        n = 2
        println(n)
    }

    println(if (bool) 1 else 2) // there is no "?" in kotlin, gotta use if as an expression

    // should use "when" in conditional expressions with multiple branches
    val obj = "Hello"

    when (obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }

    val trafficLightState = "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)
}