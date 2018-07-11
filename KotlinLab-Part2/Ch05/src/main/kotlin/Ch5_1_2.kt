package five_one_two

val isTrue1: Boolean = true && false
val isTrue2: Boolean = true || false
val isTrue3: Boolean = !true

val charData = 'C'

fun check(c: Char) {
//    if (c == 1) {
//
//    }
}

var str: String = "Hello"
const val str2 = "Hello \n World"
var str3 = """Hello
World"""

fun sum(no: Int): Int {
    var sum = 0
    for (i in 1..no) {
        sum += i
    }
    return sum
}

fun main(args: Array<String>) {
    println(isTrue1)
    println(isTrue2)
    println(isTrue3)

    println("str[1]: ${str[1]}")

    println(str2)
    println(str3)

    val name: String = "kkang"
    println("result: $name .. ${sum(10)}")
}