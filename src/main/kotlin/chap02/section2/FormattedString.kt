package chap02.section2

fun main() {
    val num = 10
    val formattedString = """
        var a = 6
        var b = "kotlin"
        println(a + num)
    """ // 줄바꿈, 공백 포함 그대로 출력됨.

    println(formattedString)
}