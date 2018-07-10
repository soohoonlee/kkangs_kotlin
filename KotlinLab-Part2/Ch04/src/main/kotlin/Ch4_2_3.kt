package four_two_three

fun sayHello(name: String = "kkang", no: Int) {
    println("Hello!! $name")
}

fun main(args: Array<String>) {
//    sayHello(10)
    sayHello("lee", 20)
    sayHello(no = 10)
    sayHello(name = "kim", no = 10)
}