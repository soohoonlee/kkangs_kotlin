package eight_three

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("nonValue", {props, old, new ->
        println("old: $old ... new: $new")
    })
}

fun main(args: Array<String>) {
    val user = User()
    println(user.name)
    user.name = "kkang"
    user.name = "kim"
    println(user.name)
}