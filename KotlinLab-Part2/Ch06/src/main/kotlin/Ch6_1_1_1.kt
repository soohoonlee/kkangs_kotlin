package six_one_one_one

fun sayHello(): String {
    return "Hello World"
}

fun some(a: Any) {
    println("some(): $a")
}

fun main(args: Array<String>) {
    10
    10 + 20
    sayHello()

    val data1 = 10
    val data2 = 10 + 20
    val data3 = sayHello()

    some(10)
    some(10 + 20)
    some(sayHello())

    for (i in 1..10) println("hello")
    val data = 10

//    val data4 = for (i in 1..10) println("hello")
//    val data5 = data = 10

//    some(for (i in 1..10) println("hello"))
//    some(data = 10)

    val count = 10
    val a = if (count > 5) {
        "true"
    } else {
        "false"
    }
    some(if (count > 5) "true" else "false")
}

