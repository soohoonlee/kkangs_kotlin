package six_two_one

fun main(args: Array<String>) {
    var sum: Int = 0
    for (i in 1..10) {
        sum += i
    }
    println(sum)

    val list = listOf("Hello", "World", "!")
    val sb = StringBuffer()
    for (str in list) {
        sb.append(str)
    }
    println(sb)

    for (i in list.indices) {
        println(list[i])
    }
    for ((index, value) in list.withIndex()) {
        println("the element at $index is $value")
    }
    for (i in 1 until 11 step 2) {
        println(i)
    }
}