package eight_one_three

var myVal: String = "hello"
    get() = field.toUpperCase()
    set(value) {
        field = "hello$value"
    }

class User1(val name: String) {
    var age: Int = 0
        set(value) {
            field = if (value > 0) value
            else 0
        }

    fun myFun() {
        var no = 0
//        get() = field * 10
    }
}

class User2(var name: String) {
    var myName: String = name
        get() = field.toUpperCase()
        set(value) {
            field = "Hello$value"
        }
}

class User3(name: String) {
    var name: String = name
    get() = field.toUpperCase()
    set(value) {
        field = "Hello$value"
    }
}

fun main(args: Array<String>) {
    val user1 = User1("kkang")
    println("name: ${user1.name}")

    val user2 = User2("kkang")
    user2.name = "lee"
    user2.myName = "kim"
    println("name: ${user2.name}")
    println("myName: ${user2.myName}")

    val user3 = User3("kkang")
    user3.name = "kim"
    println("name: ${user3.name}")
}