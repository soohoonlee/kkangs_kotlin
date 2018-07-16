package six_three_six

fun main(args: Array<String>) {
    println("true && true: ${true && true}")
    println("true && false: ${true && false}")
    println("false && true: ${false && true}")
    println("false && false: ${false && false}")
    println("true || true: ${true || true}")
    println("true || false: ${true || false}")
    println("false || true: ${false || true}")
    println("false || false: ${false || false}")

    fun trueFun(): Boolean {
        println("call..trueFun()")
        return true
    }

    fun falseFun(): Boolean {
        println("call..falseFun()")
        return false
    }
    println("trueFun() && trueFun(): ")
    trueFun() && trueFun()
    println("falseFun() && trueFun(): ")
    falseFun() && trueFun()
    println("falseFun() || trueFun(): ")
    falseFun() || trueFun()
    println("trueFun() || trueFun(): ")
    trueFun() || trueFun()
}