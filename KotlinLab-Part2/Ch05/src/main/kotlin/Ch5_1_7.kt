package five_one_seven

fun getStringLength(obj: Any): Int? {
//    val strData: String = obj
    if (obj is String) {
        return obj.length
    }
    return null
}

fun getStringLength2(obj: Any): Int? {
    if (obj !is String) {
        return null
    }
    return obj.length
}

var a1: Int = 10
var a2: Double = a1.toDouble()

val l = 1L + 3