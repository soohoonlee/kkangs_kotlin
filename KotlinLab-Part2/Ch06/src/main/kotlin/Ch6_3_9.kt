package six_three_nine

fun main(args: Array<String>) {
    var sum = 0
    for (i in 1..10) {
        sum += i
    }
    println(sum)
    println("5 in 1..10: ${5 in 1..10}")
}