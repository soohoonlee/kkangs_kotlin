package four_two_one

fun main(args: Array<String>) {
    println(sum(1, 10))
}

fun sum(a: Int, b: Int): Int {
    var sum = 0
    fun calSum() {
        for (i in a..b) {
            sum += i
        }
    }
    calSum()
    return sum
}

fun some(a: Int, b: Int): Int {
    return a + b
}

fun some2(a: Int, b: Int): Int = a + b

fun some3(a: Int, b: Int) = a + b
