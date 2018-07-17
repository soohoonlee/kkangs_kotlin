package eight_two_two

class User {
    val name1: String = "kkang"
    var name2: String? = null
    val name3: String? = null
    var age: Int? = null

    constructor(name2: String, name3: String, age: Int) {
        this.name2 = name2
//        this.name3 = name3
        this.age = age
    }
}