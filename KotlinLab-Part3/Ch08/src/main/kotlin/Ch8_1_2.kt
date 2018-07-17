package eight_one_two

class User1 {
    var greeting: String = "Hello"
        set(value) {
            field = "Hello$value"
        }
        get() = field.toUpperCase()

    var age: Int = 0
        set(value) {
            field = if (value > 0) {
                value
            } else {
                0
            }
        }
}

fun main(args: Array<String>) {
    val user1 = User1()
    user1.greeting = "kkang"
    println(user1.greeting)
    user1.age = -1
    println("age: ${user1.age}")
}