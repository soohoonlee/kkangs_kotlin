package six_four_one

data class MyClass(val no: Int) {
    operator fun plus(arg: Int): Int {
        return no - arg
    }
}

operator fun MyClass.minus(arg: Int): Int {
    return no + arg
}

class Test(val no: Int) {
    operator fun plus(arg: Int): Int {
        return no - arg
    }
}

fun main(args: Array<String>) {
    val a: Int = 10
    val b: Int = 5
    val result1: Int = a + b
    val result2: Int = a.plus(b)

    println("result1: $result1 ... result2: $result2")

    val obj: MyClass = MyClass(10)
    val result3 = obj + 5
    val result4 = obj - 5
    println("result3: $result3 .. result4: $result4")
    println("${Test(30) + 5}")
}