package eight_two_three

class User1 {
    lateinit var lateData: String
}

lateinit var data1: String

class User2(/*lateinit*/ var data: String) {
//    lateinit val data2: String
//    lateinit var data3: String?
//    lateinit var data4: Int
    lateinit var data5: String
}

fun main(args: Array<String>) {
    val user = User1()
    user.lateData = "hello"
    println(user.lateData)
}