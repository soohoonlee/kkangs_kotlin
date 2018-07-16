package seven_two_one

class MyClass1 {}
class MyClass2() {}
class MyClass3 constructor() {}

class User1 constructor(name: String, age: Int) {}
class User2(name: String, age: Int) {}

class User3(name: String, age: Int = 0) {}

class User4(name: String, age: Int) {
    init {
        println("i am init...")
    }
}

class User5(name: String, age: Int) {
    val name = name
    init {
        println("i am init... constructor argument: $name .. $age")
    }
    val upperName = name.toUpperCase()
    fun sayHello() {
        println("hello $name")
    }
}

class User6(val name: String, val age: Int) {
    val myName = name
    init {
        println("i am init... constructor argument: $name .. $age")
    }
    fun sayHello() {
        println("hello $name")
    }
}

class User7(name: String, age: Int) {
    private val name: String = "kim"
    init {
        println("i am init... constructor argument: $name")
    }
    fun sayHello() {
        println("hello $name")
    }
}

class User8(val name: String, age: Int) {
//    val name: String = "kkang"
    val age = 10
}

fun main(args: Array<String>) {
    val obj1 = MyClass1()
    val obj2 = MyClass2()
    val obj3 = MyClass3()

//    val user1 = User1()
    val user2 = User1("kkang", 33)
    val user3 = User2("kim", 28)

    val user4 = User3("kkang", 33)
    val user5 = User3("kkang")

    val user6 = User4("kkang", 33)

    val user7 = User5("kkang", 33)
    user7.sayHello()

    val user8 = User6("kkang", 33)
    user8.sayHello()

    val user9 = User7("kkang", 33)
    user9.sayHello()
}