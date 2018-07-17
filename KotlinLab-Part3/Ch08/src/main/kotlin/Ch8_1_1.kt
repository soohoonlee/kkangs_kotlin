package eight_one_one

class User {
    var name: String = "kkang"
        get() = field
        set(value) {
            field = value
        }
    val age: Int = 20
        get() = field
}

fun main(args: Array<String>) {
    val user = User()
    user.name = "kim"

    println("name: ${user.name}")
    println("age: ${user.age}")
}