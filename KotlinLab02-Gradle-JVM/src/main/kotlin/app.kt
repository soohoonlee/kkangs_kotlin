import org.apache.commons.lang3.StringUtils

fun main(args: Array<String>) {
    val data = " Hello World !! kang "
    println(StringUtils.deleteWhitespace(data))
}