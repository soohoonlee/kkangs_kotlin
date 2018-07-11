package five_one_three

fun getLength(obj: Any): Int {
    if (obj is String) {
        return obj.length
    }
    return 0
}

fun cases(obj: Any): String {
    return when(obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "unknown"
    }
}

fun main(args: Array<String>) {
    println(getLength("Hello"))
    println(getLength(10))

    println(cases(1))
    println(cases(10))
}