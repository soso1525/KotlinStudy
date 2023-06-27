package chap02.section2

fun main() {
    var a = 1
    val str1 = "a = $a" // a = 1
    val str2 = "a = ${a+2}" // a = 3

    // str1: "$str1", str2: "$str2"
    // str1: "a = 1", str2: "a = 3"
    println("str1: \"$str1\", str2: \"$str2\"")
}


