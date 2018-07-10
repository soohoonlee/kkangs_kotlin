package four_two_six

fun loopPrint(no: Int = 1) {
    var count = 1
    while (true) {
        println("loopPrint..")
        if (no == count) {
            return
        } else {
            count++
        }
    }
}

fun recPrint(no: Int = 1, count: Int = 1) {
    println("recPrint...")
    return if (no == count) {
        return
    } else {
        recPrint(no - 1, count)
    }
}

tailrec fun tailrecPrint(no: Int = 1, count: Int = 1) {
    println("tailrecPrint...")
    return if (no == count) {
        return
    } else {
        tailrecPrint(no - 1, count)
    }
}

tailrec fun sum(n: Int): Int {
    return if (n <= 0) {
        n
    } else {
        n + sum(n - 1)
    }
}

tailrec fun sum2(n: Int, result: Int = 0): Int {
    return if (n <= 0) {
        result
    } else {
        sum2(n - 1, n + result)
    }
}

fun main(args: Array<String>) {
    loopPrint(3)
    recPrint(3)
    tailrecPrint(3)

    println(sum(3))
    println(sum2(3))
}