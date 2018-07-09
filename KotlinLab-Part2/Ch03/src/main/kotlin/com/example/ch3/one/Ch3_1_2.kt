package com.example.ch3.one

import java.util.*

var sum = 0

private fun calSum() {
    for (i in 1..10) {
        sum += i
    }
}
class T1_User {
    val name = "kkang"
    fun sayHello() {
        val date = Date()
        println("date: " + date)
        println("Hello!! " + name)
    }
}


fun main(args: Array<String>) {
    calSum()
    println(sum)
    T1_User().sayHello()
}
