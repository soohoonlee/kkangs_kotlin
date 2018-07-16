package seven_two_two

class User1 {}
class User2(name: String) {}
class User3 {
    constructor(name: String)
}

class User4 {
    constructor() {}
    constructor(name: String) {}
    constructor(name: String, age: Int) {}
}

class User5 {
    init {
        println("i am init block....")
    }
    constructor() {
        println("i am constructor....")
    }
}

class User6 {
//    init {
//        println("i am init block....$name")
//    }
//    constructor(val name: String) {
//        println("i am constructor....$name")
//    }
//    fun sayHello() {
//        println("hello $name")
//    }
}

fun main(args: Array<String>) {
    val user1  = User1()
    val user2  = User2("kkang")
//    val user3  = User3()
    val user4  = User3("kkang")

    val user5 = User4()
    val user6 = User4("kkang")
    val user7 = User4("kkang", 10)

    val user8 = User5()
}