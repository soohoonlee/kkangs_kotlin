package seven_two_three

class User1(name: String) {
    init {
        println("init block... $name")
    }
    constructor(name: String, age: Int): this(name) {
        println("constructor ... $name ... $age")
    }
}

class User2(name: String) {
    constructor(name: String, age: Int): this(name) {}
    constructor(name: String, age: Int, email: String): this(name, age) {}
}

fun main(args: Array<String>) {
    println("----- 주 생성자로 생성한 경우 -----")
    val user1 = User1("kkang")
    println("----- 보조 생성자로 생성한 경우 -----")
    val user2 = User1("kkang", 33)

    val user3 = User2("kkang")
    val user4 = User2("kkang", 30)
    val user5 = User2("kkang", 30, "a@a.com")
}