package six_three_five

fun main(args: Array<String>) {
    var data = 10
    val result1 = data++
    println("result = $result1, data = $data")

    var data2 = 10
    val result2 = data2
    data2 = data2 + 1
    println("result2 = $result2, data2 = $data2")

    var data3 = 10
    val result3 = ++data3
    println("result3 = $result3, data3 = $data3")

    var data4 = 10
    data4 = data4 + 1
    val result4 = data4
    println("result4 = $result4, data4 = $data4")
}