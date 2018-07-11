package five_two_two_one

import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet

fun main(args: Array<String>) {
    val javaList: ArrayList<String> = ArrayList()
    javaList.add("hello")
    javaList.add("world")
    println("${javaList.get(0)} .. ${javaList.get(1)}")

    val javaMap: HashMap<String, String> = HashMap()
    javaMap.put("one", "helld")
    javaMap.put("two", "world")
    println("${javaMap.get("one")} .. ${javaMap.get("two")}")

    val javaSet: HashSet<String> = HashSet()
    javaSet.add("hello")
    javaSet.add("hello")
    javaSet.add("world")
    println("${javaSet.size} .. ${javaSet.elementAt(0)} .. ${javaSet.elementAt(1)}")
}