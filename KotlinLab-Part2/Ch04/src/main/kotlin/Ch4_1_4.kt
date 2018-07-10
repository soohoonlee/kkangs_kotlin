package four_one_four

var myBool = false
val myVal: String = "hello"
    get() {
        if (myBool) {
            return field
        } else {
            return field.toUpperCase()
        }
    }

const val myConst: Int = 10
//const var myConst2: Int = 10

class MyClass {
    //    const val myConst3 = 30
    object A {
        const val myConst4 = 40
    }
}

fun some() {
//    const val myConst4 = 40
}

fun main(args: Array<String>) {
    println(myVal)
    myBool = true
    println(myVal)
}

